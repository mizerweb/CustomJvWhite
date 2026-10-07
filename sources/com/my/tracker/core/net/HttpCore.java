package com.my.tracker.core.net;

/* JADX INFO: loaded from: classes.dex */
public interface HttpCore {
    HttpResult doGet(String str);

    HttpResult doPost(String str, byte[] bArr, boolean z);

    boolean isConnected();
}
