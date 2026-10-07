package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class p97 extends vgd {
    public final ShareData a;

    public p97(ShareData shareData) {
        this.a = shareData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p97) && this.a == ((p97) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ForwardSet(shareData=" + this.a + ")";
    }
}
