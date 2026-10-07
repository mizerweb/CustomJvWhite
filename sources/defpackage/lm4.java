package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lm4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                Collator collator = (Collator) obj3;
                vg4 vg4Var = (vg4) obj;
                vg4 vg4Var2 = (vg4) obj2;
                ((mm4) obj4).getClass();
                CollationKey collationKey = vg4Var.e;
                String strK = vg4Var.k();
                if (collationKey == null && strK != null) {
                    collationKey = collator.getCollationKey(strK.toLowerCase(Locale.getDefault()));
                    vg4Var.e = collationKey;
                }
                CollationKey collationKey2 = vg4Var2.e;
                String strK2 = vg4Var2.k();
                if (collationKey2 == null && strK2 != null) {
                    collationKey2 = collator.getCollationKey(strK2.toLowerCase(Locale.getDefault()));
                    vg4Var2.e = collationKey2;
                }
                boolean z2 = (strK == null || strK.length() == 0 || !Character.isLetter(strK.charAt(0))) ? false : true;
                if (strK2 != null && strK2.length() != 0 && Character.isLetter(strK2.charAt(0))) {
                    z = true;
                }
                if (!(z2 && z) && (z2 || z)) {
                    return z2 ? -1 : 1;
                }
                return collationKey.compareTo(collationKey2);
            default:
                rf7 rf7Var = (rf7) obj3;
                int i2 = -1;
                int i3 = -1;
                int i4 = 0;
                for (Long l : (Iterable) obj4) {
                    try {
                        if (l.equals(rf7Var.mo41apply(obj))) {
                            i2 = i4;
                        } else if (l.equals(rf7Var.mo41apply(obj2))) {
                            i3 = i4;
                        }
                        if (i2 != -1 && i3 != -1) {
                            if (i2 < i3) {
                                return -1;
                            }
                            if (i2 != i3) {
                                return 1;
                            }
                            return 0;
                        }
                        i4++;
                    } catch (Throwable th) {
                        qr7.o(th);
                    }
                }
                if (i2 < i3) {
                    return -1;
                }
                if (i2 != i3) {
                    return 1;
                }
                return 0;
        }
    }
}
