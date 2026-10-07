package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m4j {
    public final uui a;
    public final Uri b;
    public final boolean c;

    public m4j(uui uuiVar, Uri uri, boolean z) {
        this.a = uuiVar;
        this.b = uri;
        this.c = z;
    }

    public static Uri d(Uri uri, String str) {
        return uri.buildUpon().authority(str).build();
    }

    public final Uri a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public abstract m4j c(String str);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m4j m4jVar = (m4j) obj;
        return cqk.d(this.b, m4jVar.b) && this.a == m4jVar.a && this.c == m4jVar.c;
    }

    public int hashCode() {
        return Boolean.hashCode(this.c) + ((this.a.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoSource(type: " + this.a + ", isLive: " + this.c + ", uri: " + this.b + ")";
    }

    public m4j(m4j m4jVar) {
        this(m4jVar.a, m4jVar.b, m4jVar.c);
    }
}
