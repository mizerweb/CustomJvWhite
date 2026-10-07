package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class vji {
    public static final rji Companion = new rji();
    public final boolean a;
    public final uji b;
    public final uji c;
    public final uji d;

    public /* synthetic */ vji(int i, boolean z, uji ujiVar, uji ujiVar2, uji ujiVar3) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = new uji();
        } else {
            this.b = ujiVar;
        }
        if ((i & 4) == 0) {
            this.c = new uji();
        } else {
            this.c = ujiVar2;
        }
        if ((i & 8) == 0) {
            this.d = new uji();
        } else {
            this.d = ujiVar3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vji)) {
            return false;
        }
        vji vjiVar = (vji) obj;
        return this.a == vjiVar.a && cqk.d(this.b, vjiVar.b) && cqk.d(this.c, vjiVar.c) && cqk.d(this.d, vjiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UploadVideoConfig(isOneMeUploaderEnabled=" + this.a + ", wifi=" + this.b + ", mobile4g=" + this.c + ", mobile3g=" + this.d + ")";
    }

    public vji() {
        uji ujiVar = new uji();
        uji ujiVar2 = new uji();
        uji ujiVar3 = new uji();
        this.a = false;
        this.b = ujiVar;
        this.c = ujiVar2;
        this.d = ujiVar3;
    }
}
