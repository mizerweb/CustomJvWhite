package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ia4 {
    public final String a;
    public final v56 b;
    public final l8b c;
    public final lni d;
    public final Map e;

    public /* synthetic */ ia4(l8b l8bVar, lni lniVar, int i) {
        this(null, null, (i & 4) != 0 ? null : l8bVar, lniVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069 A[LOOP:0: B:9:0x0023->B:19:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[EDGE_INSN: B:29:0x006c->B:20:0x006c BREAK  A[LOOP:0: B:9:0x0023->B:19:0x0069], SYNTHETIC] */
    public final String a() {
        StringBuilder sb;
        l8b l8bVar = this.c;
        if (l8bVar == null || l8bVar.h()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            long[] jArr = l8bVar.b;
            Object[] objArr = l8bVar.c;
            long[] jArr2 = l8bVar.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr2[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                long j2 = jArr[i4];
                                ge3 ge3Var = (ge3) objArr[i4];
                                sb.append('#');
                                sb.append(j2);
                                sb.append(':');
                                sb.append(ge3Var);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i != length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            sb.append(']');
        }
        String string = sb != null ? sb.toString() : null;
        return string == null ? "" : string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia4)) {
            return false;
        }
        ia4 ia4Var = (ia4) obj;
        return cqk.d(this.a, ia4Var.a) && cqk.d(this.b, ia4Var.b) && cqk.d(this.c, ia4Var.c) && cqk.d(this.d, ia4Var.d) && cqk.d(this.e, ia4Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        v56 v56Var = this.b;
        int iHashCode2 = (iHashCode + (v56Var == null ? 0 : v56Var.hashCode())) * 31;
        l8b l8bVar = this.c;
        int iHashCode3 = (iHashCode2 + (l8bVar == null ? 0 : l8bVar.hashCode())) * 31;
        lni lniVar = this.d;
        int iHashCode4 = (iHashCode3 + (lniVar == null ? 0 : lniVar.hashCode())) * 31;
        Map map = this.e;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String strA = a();
        l8b l8bVar = this.c;
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + (l8bVar != null ? Integer.valueOf(l8bVar.e) : null) + ", chats=" + strA + ", server=" + this.b + " experiments=" + this.e;
    }

    public ia4(String str, v56 v56Var, l8b l8bVar, lni lniVar, Map map) {
        this.a = str;
        this.b = v56Var;
        this.c = l8bVar;
        this.d = lniVar;
        this.e = map;
    }
}
