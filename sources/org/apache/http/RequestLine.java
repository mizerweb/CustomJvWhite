package org.apache.http;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface RequestLine {
    String getMethod();

    ProtocolVersion getProtocolVersion();

    String getUri();
}
