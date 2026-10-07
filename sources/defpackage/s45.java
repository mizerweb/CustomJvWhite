package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s45 {
    public static final s45 g = new s45(false, null, null, false, null, null, 63);
    public static final s45 h = new s45(false, null, null, true, null, null, 55);
    public static final s45 i = new s45(false, null, null, true, null, null, 55);
    public final boolean a;
    public final m8b b;
    public final m8b c;
    public final boolean d;
    public final l8b e;
    public final Integer f;

    public s45(boolean z, m8b m8bVar, m8b m8bVar2, boolean z2, l8b l8bVar, Integer num, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? ui9.a : m8bVar, (i2 & 4) != 0 ? ui9.a : m8bVar2, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? ki9.a : l8bVar, (i2 & 32) != 0 ? null : num);
    }

    public final String toString() {
        String name = s45.class.getName();
        if (this == g) {
            return name.concat(".None");
        }
        if (this == h) {
            return name.concat(".LocalChats");
        }
        if (this == i) {
            return name.concat(".AllChats");
        }
        Integer num = this.f;
        if (num != null) {
            return name.concat(".ClearAll");
        }
        StringBuilder sbB = zo5.B("DispatchParams(retry=", this.a, ", allChats=", this.d, ", serverChats=");
        sbB.append(this.b);
        sbB.append(", removedChats=");
        sbB.append(this.c);
        sbB.append(", urlMap=");
        sbB.append(this.e);
        sbB.append(", groupNotificationId=");
        sbB.append(num);
        sbB.append(", )");
        return sbB.toString();
    }

    public s45(boolean z, m8b m8bVar, m8b m8bVar2, boolean z2, l8b l8bVar, Integer num) {
        this.a = z;
        this.b = m8bVar;
        this.c = m8bVar2;
        this.d = z2;
        this.e = l8bVar;
        this.f = num;
    }
}
