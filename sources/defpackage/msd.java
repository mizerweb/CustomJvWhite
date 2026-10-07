package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes2.dex */
public final class msd extends mk0 {
    public final ShareData b;
    public final tnh c;

    public msd(ShareData shareData, tnh tnhVar) {
        super(14);
        this.b = shareData;
        this.c = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof msd) {
            msd msdVar = (msd) obj;
            if (this.b == msdVar.b && this.c.equals(msdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "ShareContact(shareData=" + this.b + ", title=" + this.c + ")";
    }
}
