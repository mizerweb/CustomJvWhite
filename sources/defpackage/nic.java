package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nic {
    public static final nic c = new nic(0, 0.0f);
    public final int a;
    public final float b;

    public nic(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nic)) {
            return false;
        }
        nic nicVar = (nic) obj;
        return this.a == nicVar.a && Float.compare(this.b, nicVar.b) == 0;
    }

    public final int hashCode() {
        int i = this.a;
        return Float.hashCode(this.b) + ((i == 0 ? 0 : qt4.D(i)) * 31);
    }

    public final String toString() {
        return "OrientState(screenOrientation=" + iic.p(this.a) + ", angle=" + this.b + ")";
    }
}
