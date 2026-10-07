package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum vab {
    WEBRTC("jingle_peerconnection_so"),
    TENSORFLOW("tensorflowlite");

    public final String a;
    public final String b;

    vab(String str) {
        this.a = str;
        this.b = c0a.o("lib", str, ".so");
    }
}
