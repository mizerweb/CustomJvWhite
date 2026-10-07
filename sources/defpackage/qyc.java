package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qyc {
    public final py2 a;
    public final Long b;
    public final xn3 c;
    public final boolean d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;

    public qyc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, py2 py2Var, Long l, xn3 xn3Var, boolean z) {
        this.a = py2Var;
        this.b = l;
        this.c = xn3Var;
        this.d = z;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    public static final qxc a(qyc qycVar, vg4 vg4Var) {
        Uri uri;
        Uri uriA;
        CharSequence charSequenceY;
        ynh xnhVar;
        ynh ynhVar;
        zv8[] zv8VarArr;
        int iOrdinal;
        boolean z;
        rt2 rt2Var;
        int i;
        boolean zB;
        long jV;
        Long lValueOf;
        String strK;
        ny8 ny8Var = qycVar.h;
        xn3 xn3Var = qycVar.c;
        py2 py2Var = qycVar.a;
        ny8 ny8Var2 = qycVar.g;
        jcd jcdVar = (jcd) ny8Var2.getValue();
        Long l = qycVar.b;
        boolean zC = jcdVar.c(l != null ? (rt2) xn3Var.k(l.longValue()).a.getValue() : null, vg4Var);
        qfd qfdVarB = ((yfd) qycVar.f.getValue()).B(vg4Var.v());
        if (!zC) {
            String strZ = vg4Var.z(us0.c);
            if (strZ != null) {
                uriA = Uri.parse(strZ);
            } else {
                uri = null;
            }
            if (zC) {
                xnhVar = new tnh(jcd.b((jcd) ny8Var2.getValue(), null, 1));
            } else if (!vg4Var.E() && vg4Var.H()) {
                xnhVar = new tnh(R.string.service_notifications);
            } else if (vg4Var.E()) {
                xnhVar = new tnh(R.string.bot);
            } else {
                charSequenceY = ((yfd) qycVar.e.getValue()).y(vg4Var);
                if (charSequenceY.length() == 0) {
                    xnhVar = new tnh(R.string.contact_empty_last_seen);
                } else {
                    xnhVar = new xnh(charSequenceY);
                }
            }
            ynhVar = xnhVar;
            b5d b5dVar = ((e5d) ny8Var.getValue()).G6;
            zv8VarArr = e5d.S6;
            boolean zBooleanValue = ((Boolean) b5dVar.a(zv8VarArr[399]).i()).booleanValue();
            boolean zF = vg4Var.F();
            boolean zB2 = vg4Var.B();
            if (py2Var != py2.b && zBooleanValue && (zF || !zB2 || zC)) {
                return null;
            }
            if (zC) {
                z = false;
            } else {
                iOrdinal = py2Var.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 2 || iOrdinal == 3) {
                        if (((Boolean) ((e5d) ny8Var.getValue()).J3.a(zv8VarArr[245]).i()).booleanValue()) {
                            if (l != null) {
                                rt2Var = (rt2) xn3Var.k(l.longValue()).a.getValue();
                            } else {
                                rt2Var = null;
                            }
                            if (((rt2Var != null || !rt2Var.d0()) && !qycVar.d) || !vg4Var.E()) {
                                if ((vg4Var.a.b.z.b & 64) != 0) {
                                    z = false;
                                }
                            }
                        } else if ((vg4Var.a.b.z.b & 64) != 0) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (vg4Var.F()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            i = vg4Var.E() ? 5 : 3;
            zB = false;
            jV = vg4Var.v();
            lValueOf = Long.valueOf(vg4Var.v());
            strK = vg4Var.k();
            if (strK != null) {
                ore.p("Required value was null.");
                return null;
            }
            xnh xnhVar2 = new xnh(strK);
            if (!zC) {
                zB = qfdVarB.b();
            }
            return new qxc(jV, lValueOf, xnhVar2, ynhVar, uri, zB, vg4Var.G(), new xyc(1, i, vg4Var.v()), vg4Var.u(), (Integer) null, z, 1536);
        }
        uriA = ((jcd) ny8Var2.getValue()).a();
        uri = uriA;
        if (zC) {
            xnhVar = new tnh(jcd.b((jcd) ny8Var2.getValue(), null, 1));
        } else if (!vg4Var.E()) {
            if (vg4Var.E()) {
                xnhVar = new tnh(R.string.bot);
            } else {
                charSequenceY = ((yfd) qycVar.e.getValue()).y(vg4Var);
                if (charSequenceY.length() == 0) {
                    xnhVar = new tnh(R.string.contact_empty_last_seen);
                } else {
                    xnhVar = new xnh(charSequenceY);
                }
            }
        } else if (vg4Var.E()) {
            xnhVar = new tnh(R.string.bot);
        } else {
            charSequenceY = ((yfd) qycVar.e.getValue()).y(vg4Var);
            if (charSequenceY.length() == 0) {
                xnhVar = new tnh(R.string.contact_empty_last_seen);
            } else {
                xnhVar = new xnh(charSequenceY);
            }
        }
        ynhVar = xnhVar;
        b5d b5dVar2 = ((e5d) ny8Var.getValue()).G6;
        zv8VarArr = e5d.S6;
        boolean zBooleanValue2 = ((Boolean) b5dVar2.a(zv8VarArr[399]).i()).booleanValue();
        boolean zF2 = vg4Var.F();
        boolean zB3 = vg4Var.B();
        if (py2Var != py2.b) {
        }
        if (zC) {
            iOrdinal = py2Var.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (((Boolean) ((e5d) ny8Var.getValue()).J3.a(zv8VarArr[245]).i()).booleanValue()) {
                        if (l != null) {
                            rt2Var = (rt2) xn3Var.k(l.longValue()).a.getValue();
                        } else {
                            rt2Var = null;
                        }
                        if (rt2Var != null) {
                        }
                        if ((vg4Var.a.b.z.b & 64) != 0) {
                            z = false;
                        }
                    } else if ((vg4Var.a.b.z.b & 64) != 0) {
                        z = false;
                    }
                } else if (((Boolean) ((e5d) ny8Var.getValue()).J3.a(zv8VarArr[245]).i()).booleanValue()) {
                    if (l != null) {
                        rt2Var = (rt2) xn3Var.k(l.longValue()).a.getValue();
                    } else {
                        rt2Var = null;
                    }
                    if (rt2Var != null) {
                    }
                    if ((vg4Var.a.b.z.b & 64) != 0) {
                        z = false;
                    }
                } else if ((vg4Var.a.b.z.b & 64) != 0) {
                    z = false;
                }
                z = true;
            } else if (vg4Var.F()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (vg4Var.E()) {
        }
        zB = false;
        jV = vg4Var.v();
        lValueOf = Long.valueOf(vg4Var.v());
        strK = vg4Var.k();
        if (strK != null) {
            ore.p("Required value was null.");
            return null;
        }
        xnh xnhVar3 = new xnh(strK);
        if (!zC) {
            zB = qfdVarB.b();
        }
        return new qxc(jV, lValueOf, xnhVar3, ynhVar, uri, zB, vg4Var.G(), new xyc(1, i, vg4Var.v()), vg4Var.u(), (Integer) null, z, 1536);
    }

    public final qxc b(vg4 vg4Var) {
        try {
            return a(this, vg4Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String name = qyc.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return null;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                return null;
            }
            a4cVar.c(je9Var, name, zo5.j(vg4Var.v(), "fail to map contact #"), th);
            return null;
        }
    }
}
