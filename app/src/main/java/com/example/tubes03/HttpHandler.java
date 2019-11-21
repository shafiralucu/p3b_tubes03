package com.example.tubes03;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpHandler {
    public HttpHandler instance;
    public final HttpClient client;
    public final Gson gson;
    private static final String apiUrl = "https://www.mangaeden.com/api/";
    private static final String accUrl = "https://www.mangaeden.com/ajax/";
    private static final String profUrl = "https://www.mangaeden.com/api/mymanga/";

    public HttpHandler() {
    }
