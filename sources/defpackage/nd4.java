package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.nio.channels.AsynchronousChannelGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class nd4 {
    public final ny8 a;
    public final ny8 b;
    public sgg e;
    public int f;
    public final String c = nd4.class.getName();
    public final l9b d = new l9b();
    public final wme g = new wme(new pe3(10, this));

    public nd4(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(nq4 nq4Var) {
        ld4 ld4Var;
        l9b l9bVar;
        AsynchronousChannelGroup asynchronousChannelGroup;
        if (nq4Var instanceof ld4) {
            ld4Var = (ld4) nq4Var;
            int i = ld4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld4Var.g = i - Integer.MIN_VALUE;
            } else {
                ld4Var = new ld4(this, nq4Var);
            }
        } else {
            ld4Var = new ld4(this, nq4Var);
        }
        Object obj = ld4Var.e;
        hu4 hu4Var = hu4.a;
        int i2 = ld4Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.d;
            ld4Var.d = l9bVar2;
            ld4Var.g = 1;
            if (l9bVar2.b(ld4Var) == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9bVar = ld4Var.d;
            ch3.d0(obj);
        }
        try {
            sgg sggVar = this.e;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.e = null;
            try {
                Object value = this.g.getValue();
                int i3 = this.f + 1;
                this.f = i3;
                String str = this.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Acquired channel group is used by " + i3 + " channels", null);
                    }
                }
                asynchronousChannelGroup = (AsynchronousChannelGroup) value;
            } catch (Throwable th) {
                String str2 = "Error while creating AsynchronousChannelGroup: " + th;
                gm0.V(this.c, str2, new kd4(str2, th));
                asynchronousChannelGroup = null;
            }
            l9bVar.g(null);
            return asynchronousChannelGroup;
        } catch (Throwable th2) {
            l9bVar.g(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(AsynchronousChannelGroup asynchronousChannelGroup, nq4 nq4Var) {
        md4 md4Var;
        l9b l9bVar;
        if (nq4Var instanceof md4) {
            md4Var = (md4) nq4Var;
            int i = md4Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                md4Var.h = i - Integer.MIN_VALUE;
            } else {
                md4Var = new md4(this, nq4Var);
            }
        } else {
            md4Var = new md4(this, nq4Var);
        }
        Object obj = md4Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = md4Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = this.d;
            md4Var.d = asynchronousChannelGroup;
            md4Var.e = l9bVar;
            md4Var.h = 1;
            if (l9bVar.b(md4Var) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9b l9bVar2 = md4Var.e;
            AsynchronousChannelGroup asynchronousChannelGroup2 = md4Var.d;
            ch3.d0(obj);
            l9bVar = l9bVar2;
            asynchronousChannelGroup = asynchronousChannelGroup2;
        }
        try {
            if (this.g.d()) {
                if (cqk.d(this.g.getValue(), asynchronousChannelGroup)) {
                    int i3 = this.f - 1;
                    this.f = i3;
                    if (i3 == 0) {
                        c();
                    } else {
                        String str = this.c;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Released channel group is used by " + i3 + " channels", null);
                            }
                        }
                    }
                } else {
                    gm0.V(this.c, "Seems like channel group is leaked, shutdown leaked group", new kd4("Seems like channel group is leaked, shutdown leaked group", null, 2, null));
                    asynchronousChannelGroup.shutdown();
                }
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final void c() throws IllegalAccessException, InvocationTargetException {
        String str = this.c;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Schedule releasing of channel group with 10000 ms delay", null);
            }
        }
        sgg sggVar = this.e;
        if (sggVar != null) {
            sggVar.b(null);
        }
        this.e = yab.i0((gu4) this.b.getValue(), null, 0, new jd3(this, lq4Var, 13), 3);
    }
}
