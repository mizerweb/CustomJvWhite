package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Settings;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v4c {
    public final Context a;
    public final y6b b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h;
    public final String i;
    public final ConcurrentHashMap j;
    public final String k;

    public v4c(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, y6b y6bVar, ha9 ha9Var) {
        this.a = context;
        this.b = y6bVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        int i = ha9Var.a;
        this.h = zo5.h(i, "CHAT_NOTIF_");
        this.i = zo5.h(i, "MESS_GROUP_NOTIF_");
        this.j = new ConcurrentHashMap(50);
        ((e1c) ny8Var3.getValue()).getClass();
        this.k = "ru.oneme.app.notifications." + i;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public final flb a() {
        return (flb) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rt2 rt2Var, nq4 nq4Var) {
        r4c r4cVar;
        if (nq4Var instanceof r4c) {
            r4cVar = (r4c) nq4Var;
            int i = r4cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                r4cVar.g = i - Integer.MIN_VALUE;
            } else {
                r4cVar = new r4c(this, nq4Var);
            }
        } else {
            r4cVar = new r4c(this, nq4Var);
        }
        Object objL0 = r4cVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = r4cVar.g;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objL0);
            ai8 ai8Var = new ai8(this, rt2Var, lq4Var, 12);
            r4cVar.d = rt2Var;
            r4cVar.g = 1;
            objL0 = lvb.L0(200L, ai8Var, r4cVar);
            if (objL0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = r4cVar.d;
            ch3.d0(objL0);
        }
        Bitmap bitmap = (Bitmap) objL0;
        if (bitmap != null) {
            return bitmap;
        }
        flb flbVarA = a();
        flbVarA.getClass();
        rt2Var.K0();
        rt2Var.L0();
        return flbVarA.f(rt2Var.m, Long.valueOf(rt2Var.q()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(vg4 vg4Var, nq4 nq4Var) {
        s4c s4cVar;
        if (nq4Var instanceof s4c) {
            s4cVar = (s4c) nq4Var;
            int i = s4cVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4cVar.g = i - Integer.MIN_VALUE;
            } else {
                s4cVar = new s4c(this, nq4Var);
            }
        } else {
            s4cVar = new s4c(this, nq4Var);
        }
        Object objL0 = s4cVar.e;
        int i2 = s4cVar.g;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objL0);
            ai8 ai8Var = new ai8(this, vg4Var, lq4Var, 13);
            s4cVar.d = vg4Var;
            s4cVar.g = 1;
            objL0 = lvb.L0(200L, ai8Var, s4cVar);
            hu4 hu4Var = hu4.a;
            if (objL0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vg4Var = s4cVar.d;
            ch3.d0(objL0);
        }
        Bitmap bitmap = (Bitmap) objL0;
        if (bitmap != null) {
            return bitmap;
        }
        flb flbVarA = a();
        flbVarA.getClass();
        return flbVarA.f(vg4Var.u(), Long.valueOf(vg4Var.v()));
    }

    public final int d() {
        return Long.hashCode(((zed) this.c.getValue()).a.t());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, nq4 nq4Var) {
        t4c t4cVar;
        int i;
        if (nq4Var instanceof t4c) {
            t4cVar = (t4c) nq4Var;
            int i2 = t4cVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4cVar.h = i2 - Integer.MIN_VALUE;
            } else {
                t4cVar = new t4c(this, nq4Var);
            }
        } else {
            t4cVar = new t4c(this, nq4Var);
        }
        Object obj = t4cVar.f;
        int i3 = t4cVar.h;
        ConcurrentHashMap concurrentHashMap = this.j;
        if (i3 == 0) {
            ch3.d0(obj);
            Integer num = (Integer) concurrentHashMap.get(new Long(j));
            if (num != null) {
                return num;
            }
            int i4 = (int) j;
            int i5 = i4 + (i4 >> 32);
            xn3 xn3Var = (xn3) this.f.getValue();
            t4cVar.d = j;
            t4cVar.e = i5;
            t4cVar.h = 1;
            Object objI = xn3Var.i(j, t4cVar);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
            obj = objI;
            i = i5;
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = t4cVar.e;
            j = t4cVar.d;
            ch3.d0(obj);
        }
        rt2 rt2Var = (rt2) obj;
        if (rt2Var != null) {
            long j2 = rt2Var.a;
            if (-2147483648L <= j2 && j2 <= 2147483647L) {
                i = (int) j2;
            }
        }
        return concurrentHashMap.computeIfAbsent(new Long(j), new mm(12, new q4c(i, 0)));
    }

    public final mmb f(String str, boolean z) {
        if (str.length() != 0) {
            return new mmb(str, z, new Uri.Builder().scheme("content").authority("ru.oneme.app.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build());
        }
        gm0.Y(v4c.class.getName(), "Early return in getNotificationImage cuz of url.isEmpty()");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(nq4 nq4Var) {
        u4c u4cVar;
        Object poeVar;
        if (nq4Var instanceof u4c) {
            u4cVar = (u4c) nq4Var;
            int i = u4cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4cVar.f = i - Integer.MIN_VALUE;
            } else {
                u4cVar = new u4c(this, nq4Var);
            }
        } else {
            u4cVar = new u4c(this, nq4Var);
        }
        Object objB = u4cVar.d;
        int i2 = u4cVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objB);
                if (!this.b.d()) {
                    return null;
                }
                utd utdVar = (utd) this.g.getValue();
                u4cVar.f = 1;
                objB = utdVar.b(((s7f) ((et3) utdVar.e.getValue())).t(), u4cVar);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            poeVar = ((vjd) objB).d.k();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String str = (String) poeVar;
        if (str == null || r5h.X0(str)) {
            return null;
        }
        return str;
    }
}
