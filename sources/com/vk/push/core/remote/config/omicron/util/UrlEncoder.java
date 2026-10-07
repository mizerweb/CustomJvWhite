package com.vk.push.core.remote.config.omicron.util;

import defpackage.qr7;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class UrlEncoder {
    public static String encodeUtf8(Object obj) {
        try {
            return URLEncoder.encode(obj.toString(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            qr7.o(e);
            return null;
        }
    }
}
