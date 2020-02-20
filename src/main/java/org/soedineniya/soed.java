package org.soedineniya;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;


import javax.swing.event.HyperlinkEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.HashSet;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.io.FileUtils;


public class soed {

    String link;

    public soed(String link) {
        this.link = link;
        try {
            connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connect() throws IOException {
        Document doc = Jsoup.connect(link).userAgent("Mozilla").get();
        Elements links = doc.select("*");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D://test.html"));
            writer.write(doc.toString());
        }
        catch (IOException e) {
        }

        System.out.println(links.text());
        countRepeatingElements(links);
    }

    public Map<Object, AtomicInteger> countRepeatingElements(Object... elements) {
        ConcurrentMap<Object, AtomicInteger> result = new ConcurrentHashMap<Object, AtomicInteger>();
        for (Object element : elements) {
            result.putIfAbsent(element, new AtomicInteger(0));
            result.get(element).incrementAndGet();
        }
        return result;
    }

    //private static void twoSets(Elements links)
   /* {
        HashSet<String> myHashSet = new HashSet<String>();



        Set<String> foundStrings = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Element str : links)
        {
            if (foundStrings.contains(str))
            {
                duplicates.add(str.text());
            }
            else
            {
                foundStrings.add(str.text());
            }
        }
        System.out.println(duplicates.size());
    }*/



}




