package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zme extends sg5 {
    public final boolean c;
    public final y78 d;
    public final es0 e;
    public boolean f;
    public final jp8 g;
    public final /* synthetic */ ane h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zme(ane aneVar, lq0 lq0Var, es0 es0Var, boolean z, y78 y78Var) {
        super(lq0Var);
        this.h = aneVar;
        this.f = false;
        this.e = es0Var;
        es0Var.a.getClass();
        this.c = z;
        this.d = y78Var;
        this.g = new jp8(aneVar.a, new w4(this));
        es0Var.a(new r68(this, 2, lq0Var));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        char c;
        boolean zContains;
        p76 p76VarB = (p76) obj;
        if (this.f) {
            return;
        }
        boolean zA = lq0.a(i);
        lq0 lq0Var = this.b;
        if (p76VarB == null) {
            if (zA) {
                lq0Var.g(1, null);
                return;
            }
            return;
        }
        p76VarB.Y();
        i68 i68Var = p76VarB.b;
        es0 es0Var = this.e;
        v78 v78Var = es0Var.a;
        x78 x78VarCreateImageTranscoder = this.d.createImageTranscoder(i68Var, this.c);
        x78VarCreateImageTranscoder.getClass();
        p76VarB.Y();
        if (p76VarB.b == i68.c) {
            c = 3;
        } else {
            p76VarB.Y();
            c = 2;
            if (x78VarCreateImageTranscoder.d(p76VarB.b)) {
                iue iueVar = v78Var.i;
                if (!iueVar.b) {
                    if (as8.b(p76VarB, iueVar) == 0) {
                        if (iueVar.a == -2 || iueVar.b) {
                            p76VarB.d = 0;
                            zContains = false;
                        } else {
                            b50 b50Var = as8.a;
                            p76VarB.Y();
                            zContains = b50Var.contains(Integer.valueOf(p76VarB.d));
                        }
                        if (!zContains) {
                            if (x78VarCreateImageTranscoder.b(p76VarB, v78Var.i, v78Var.h)) {
                            }
                        }
                    }
                    c = 1;
                } else if (x78VarCreateImageTranscoder.b(p76VarB, v78Var.i, v78Var.h)) {
                    c = 1;
                }
            }
        }
        if (zA || c != 3) {
            if (c == 1) {
                jp8 jp8Var = this.g;
                if (jp8Var.d(p76VarB, i)) {
                    if (zA || es0Var.f()) {
                        jp8Var.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i68Var != kb5.a && i68Var != kb5.k) {
                int i2 = v78Var.i.a;
                if (i2 != -1 && i2 != -2) {
                    if (i2 == -1) {
                        ore.k("Rotation is set to use EXIF");
                        return;
                    } else {
                        p76VarB = p76.b(p76VarB);
                        if (p76VarB != null) {
                            p76VarB.c = i2;
                        }
                    }
                }
            } else if (!v78Var.i.b) {
                p76VarB.Y();
                if (p76VarB.c != 0) {
                    p76VarB.Y();
                    if (p76VarB.c != -1 && (p76VarB = p76.b(p76VarB)) != null) {
                        p76VarB.c = 0;
                    }
                }
            }
            lq0Var.g(i, p76VarB);
        }
    }

    public final h98 m(p76 p76Var, bne bneVar, ww6 ww6Var, String str) {
        String str2;
        long j;
        es0 es0Var = this.e;
        if (!es0Var.c.c(es0Var, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        p76Var.Y();
        sb.append(p76Var.e);
        sb.append("x");
        p76Var.Y();
        sb.append(p76Var.f);
        String string = sb.toString();
        if (bneVar != null) {
            str2 = bneVar.a + "x" + bneVar.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        p76Var.Y();
        map.put("Image format", String.valueOf(p76Var.b));
        map.put("Original size", string);
        map.put("Requested size", str2);
        jp8 jp8Var = this.g;
        synchronized (jp8Var) {
            j = jp8Var.i - jp8Var.h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(ww6Var));
        return new h98(map);
    }
}
