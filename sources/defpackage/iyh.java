package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iyh {
    public static final iyh d = new iyh(new hyh[0]);
    public static final String e;
    public final int a;
    public final ghe b;
    public int c;

    static {
        String str = vqi.a;
        e = Integer.toString(0, 36);
    }

    public iyh(hyh... hyhVarArr) {
        ghe gheVarO = c98.o(hyhVarArr);
        this.b = gheVarO;
        this.a = hyhVarArr.length;
        int i = 0;
        while (i < gheVarO.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < gheVarO.d; i3++) {
                if (((hyh) gheVarO.get(i)).equals(gheVarO.get(i3))) {
                    lvb.l0("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final hyh a(int i) {
        return (hyh) this.b.get(i);
    }

    public final int b(hyh hyhVar) {
        int iIndexOf = this.b.indexOf(hyhVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iyh.class != obj.getClass()) {
            return false;
        }
        iyh iyhVar = (iyh) obj;
        if (this.a != iyhVar.a) {
            return false;
        }
        ghe gheVar = iyhVar.b;
        ghe gheVar2 = this.b;
        gheVar2.getClass();
        return j8f.a(gheVar2, gheVar);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
