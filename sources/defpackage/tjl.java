package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tjl {
    public static final String a(qs8 qs8Var, fif fifVar) {
        for (Annotation annotation : fifVar.getAnnotations()) {
            if (annotation instanceof zs8) {
                return ((zs8) annotation).discriminator();
            }
        }
        return qs8Var.a.g;
    }

    public static boolean b(int i) {
        return i == 6 || i == 1 || i == 2 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[PHI: r1
  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static xg0 c(int i) {
        int i2 = 6;
        if (i != 0) {
            int i3 = 1;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = i3;
            } else {
                i3 = 5;
                if (i == 3) {
                    i2 = i3;
                } else if (i == 4) {
                    i2 = 3;
                } else if (i != 5) {
                    if (i == 6) {
                        i2 = 2;
                    } else {
                        i3 = 7;
                        if (i != 7 && i != 8) {
                            if (i == 9) {
                                i2 = 4;
                            } else if (i == 10) {
                                i2 = i3;
                            } else if (i != 11 && i != 12 && i != 13) {
                                qr7.j(ne2.a(i), "Unexpected CameraError: ");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return new xg0(i2);
    }
}
