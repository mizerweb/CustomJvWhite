package defpackage;

import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes3.dex */
public final class er6 implements gr6 {
    public final WebChromeClient.FileChooserParams a;

    public er6(WebChromeClient.FileChooserParams fileChooserParams) {
        this.a = fileChooserParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er6) && this.a.equals(((er6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowFile(params=" + this.a + ")";
    }
}
