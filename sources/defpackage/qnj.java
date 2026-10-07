package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes3.dex */
public final class qnj implements ynj {
    public final ShareData a;

    public qnj(ShareData shareData) {
        this.a = shareData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnj) && cqk.d(this.a, ((qnj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowMaxShareDialog(shareData=" + this.a + ")";
    }
}
