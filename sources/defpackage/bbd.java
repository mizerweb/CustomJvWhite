package defpackage;

import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class bbd {
    public final abd a;
    public waa b;
    public fy0 c;
    public waa d;
    public mx6 e;
    public waa f;
    public qg7 g;
    public qf4 h;
    public uj7 i;

    public bbd(abd abdVar) {
        this.a = abdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    public final fy0 a() {
        abd abdVar = this.a;
        nhb nhbVar = abdVar.b;
        uba ubaVar = abdVar.d;
        if (this.c == null) {
            String str = abdVar.i;
            switch (str.hashCode()) {
                case -1868884870:
                    if (!str.equals("legacy_default_params")) {
                        this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    } else {
                        this.c = new d31(ubaVar, i85.a(), nhbVar);
                    }
                    break;
                case -1106578487:
                    str.equals("legacy");
                    this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    break;
                case -404562712:
                    if (!str.equals("experimental")) {
                        this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    } else {
                        this.c = new lj9(abdVar.j, nhb.e());
                    }
                    break;
                case -402149703:
                    if (!str.equals("dummy_with_tracking")) {
                        this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    } else {
                        this.c = new dw5();
                    }
                    break;
                case 95945896:
                    if (!str.equals("dummy")) {
                        this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    } else {
                        this.c = new bw5();
                    }
                    break;
                default:
                    this.c = new d31(ubaVar, abdVar.a, nhbVar);
                    break;
            }
        }
        return this.c;
    }

    public final qg7 b(int i) {
        waa waaVar;
        if (this.g == null) {
            abd abdVar = this.a;
            nhb nhbVar = abdVar.f;
            cbd cbdVar = abdVar.e;
            uba ubaVar = abdVar.d;
            if (i == 0) {
                if (this.f == null) {
                    try {
                        this.f = (waa) NativeMemoryChunkPool.class.getConstructor(uba.class, cbd.class, dbd.class).newInstance(ubaVar, cbdVar, nhbVar);
                    } catch (ClassNotFoundException e) {
                        pj6.c("PoolFactory", "", e);
                        this.f = null;
                    } catch (IllegalAccessException e2) {
                        pj6.c("PoolFactory", "", e2);
                        this.f = null;
                    } catch (InstantiationException e3) {
                        pj6.c("PoolFactory", "", e3);
                        this.f = null;
                    } catch (NoSuchMethodException e4) {
                        pj6.c("PoolFactory", "", e4);
                        this.f = null;
                    } catch (InvocationTargetException e5) {
                        pj6.c("PoolFactory", "", e5);
                        this.f = null;
                    }
                }
                waaVar = this.f;
            } else if (i == 1) {
                if (this.d == null) {
                    try {
                        this.d = (waa) BufferMemoryChunkPool.class.getConstructor(uba.class, cbd.class, dbd.class).newInstance(ubaVar, cbdVar, nhbVar);
                    } catch (ClassNotFoundException unused) {
                        this.d = null;
                    } catch (IllegalAccessException unused2) {
                        this.d = null;
                    } catch (InstantiationException unused3) {
                        this.d = null;
                    } catch (NoSuchMethodException unused4) {
                        this.d = null;
                    } catch (InvocationTargetException unused5) {
                        this.d = null;
                    }
                }
                waaVar = this.d;
            } else {
                if (i != 2) {
                    ore.p("Invalid MemoryChunkType");
                    return null;
                }
                if (this.b == null) {
                    try {
                        this.b = (waa) AshmemMemoryChunkPool.class.getConstructor(uba.class, cbd.class, dbd.class).newInstance(ubaVar, cbdVar, nhbVar);
                    } catch (ClassNotFoundException unused6) {
                        this.b = null;
                    } catch (IllegalAccessException unused7) {
                        this.b = null;
                    } catch (InstantiationException unused8) {
                        this.b = null;
                    } catch (NoSuchMethodException unused9) {
                        this.b = null;
                    } catch (InvocationTargetException unused10) {
                        this.b = null;
                    }
                }
                waaVar = this.b;
            }
            oc9.q(waaVar, "failed to get pool for chunk type: " + i);
            this.g = new qg7(waaVar, 13, c());
        }
        return this.g;
    }

    public final qf4 c() {
        if (this.h == null) {
            if (this.i == null) {
                abd abdVar = this.a;
                this.i = new uj7(abdVar.d, abdVar.g, abdVar.h);
            }
            this.h = new qf4(this.i);
        }
        return this.h;
    }
}
