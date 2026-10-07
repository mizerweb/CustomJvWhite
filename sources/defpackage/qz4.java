package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qz4 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public qz4(nj6 nj6Var, lhb lhbVar) {
        this.b = nj6Var;
        this.f = lhbVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = true;
    }

    public void a() {
        y8j y8jVar = (y8j) this.c;
        xgh xghVar = (xgh) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        oz4 oz4Var = new oz4(xghVar);
        y8jVar.e(oz4Var);
        this.f = oz4Var;
        pz4 pz4Var = new pz4(0, y8jVar);
        xghVar.a(pz4Var);
        this.g = pz4Var;
        xghVar.o(y8jVar.getCurrentItem(), 0.0f, true, true, true);
        ((k67) this.d).invoke();
    }

    public b85 b() {
        Context context = (Context) this.b;
        lvb.b0(!this.a);
        this.a = true;
        if (((ks6) this.d) == null) {
            this.d = new ks6(new fb0[0]);
        }
        jc0 jc0Var = (jc0) this.f;
        v2a v2aVar = (v2a) this.g;
        if (jc0Var == null) {
            if (v2aVar == null) {
                this.g = new v2a(context, 21);
            }
            if (((ku6) this.e) == null) {
                this.e = ku6.g;
            }
            gvb gvbVar = new gvb();
            gvbVar.b = context != null ? context.getApplicationContext() : null;
            gvbVar.d = ku6.g;
            if (context == null) {
                gvbVar.a = u70.c;
            }
            u70 u70Var = context == null ? (u70) this.c : null;
            Context context2 = (Context) gvbVar.b;
            if (context2 == null) {
                gvbVar.a = u70Var;
            }
            v2a v2aVar2 = (v2a) this.g;
            gvbVar.c = v2aVar2;
            gvbVar.d = (ku6) this.e;
            if (v2aVar2 == null) {
                gvbVar.c = new v2a(context2, 21);
            }
            this.f = new jc0(gvbVar);
        } else {
            lvb.b0(v2aVar == null);
            lvb.b0(((ku6) this.e) == null);
        }
        return new b85(this);
    }

    public void c() {
        if (this.a) {
            pz4 pz4Var = (pz4) this.g;
            if (pz4Var != null) {
                ((xgh) this.b).k(pz4Var);
            }
            this.g = null;
            oz4 oz4Var = (oz4) this.f;
            if (oz4Var != null) {
                ((y8j) this.c).j(oz4Var);
            }
            this.f = null;
            this.a = false;
            ((k67) this.e).invoke();
        }
    }

    public w4a d(int i) {
        pah pahVar;
        pah pahVar2;
        HashMap map = (HashMap) this.d;
        w4a w4aVar = (w4a) map.get(Integer.valueOf(i));
        if (w4aVar != null) {
            return w4aVar;
        }
        HashMap map2 = (HashMap) this.c;
        pah pahVar3 = (pah) map2.get(Integer.valueOf(i));
        if (pahVar3 == null) {
            final s25 s25Var = (s25) this.e;
            s25Var.getClass();
            if (i != 0) {
                final int i2 = 1;
                if (i != 1) {
                    final int i3 = 2;
                    if (i != 2) {
                        final int i4 = 3;
                        if (i == 3) {
                            final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(w4a.class);
                            pahVar2 = new pah() { // from class: hc5
                                @Override // defpackage.pah
                                public final Object get() {
                                    try {
                                        return (w4a) clsAsSubclass.getConstructor(null).newInstance(null);
                                    } catch (Exception e) {
                                        qr7.w(e);
                                        return null;
                                    }
                                }
                            };
                        } else if (i == 4) {
                            pahVar2 = new pah() { // from class: gc5
                                @Override // defpackage.pah
                                public final Object get() {
                                    int i5 = i4;
                                    s25 s25Var2 = s25Var;
                                    Object obj = this;
                                    switch (i5) {
                                        case 0:
                                            return jc5.f((Class) obj, s25Var2);
                                        case 1:
                                            return jc5.f((Class) obj, s25Var2);
                                        case 2:
                                            return jc5.f((Class) obj, s25Var2);
                                        default:
                                            return new xvd(s25Var2, (nj6) ((qz4) obj).b);
                                    }
                                }
                            };
                        } else {
                            ore.p(zo5.h(i, "Unrecognized contentType: "));
                            pahVar3 = null;
                        }
                        pahVar3 = pahVar2;
                    } else {
                        final Class clsAsSubclass2 = HlsMediaSource$Factory.class.asSubclass(w4a.class);
                        pahVar = new pah() { // from class: gc5
                            @Override // defpackage.pah
                            public final Object get() {
                                int i5 = i3;
                                s25 s25Var2 = s25Var;
                                Object obj = clsAsSubclass2;
                                switch (i5) {
                                    case 0:
                                        return jc5.f((Class) obj, s25Var2);
                                    case 1:
                                        return jc5.f((Class) obj, s25Var2);
                                    case 2:
                                        return jc5.f((Class) obj, s25Var2);
                                    default:
                                        return new xvd(s25Var2, (nj6) ((qz4) obj).b);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(w4a.class);
                    pahVar = new pah() { // from class: gc5
                        @Override // defpackage.pah
                        public final Object get() {
                            int i5 = i2;
                            s25 s25Var2 = s25Var;
                            Object obj = genericDeclarationAsSubclass;
                            switch (i5) {
                                case 0:
                                    return jc5.f((Class) obj, s25Var2);
                                case 1:
                                    return jc5.f((Class) obj, s25Var2);
                                case 2:
                                    return jc5.f((Class) obj, s25Var2);
                                default:
                                    return new xvd(s25Var2, (nj6) ((qz4) obj).b);
                            }
                        }
                    };
                }
                pahVar3 = pahVar;
            } else {
                final Class clsAsSubclass3 = DashMediaSource$Factory.class.asSubclass(w4a.class);
                final int i5 = 0;
                pahVar3 = new pah() { // from class: gc5
                    @Override // defpackage.pah
                    public final Object get() {
                        int i6 = i5;
                        s25 s25Var2 = s25Var;
                        Object obj = clsAsSubclass3;
                        switch (i6) {
                            case 0:
                                return jc5.f((Class) obj, s25Var2);
                            case 1:
                                return jc5.f((Class) obj, s25Var2);
                            case 2:
                                return jc5.f((Class) obj, s25Var2);
                            default:
                                return new xvd(s25Var2, (nj6) ((qz4) obj).b);
                        }
                    }
                };
            }
            map2.put(Integer.valueOf(i), pahVar3);
        }
        w4a w4aVar2 = (w4a) pahVar3.get();
        kr6 kr6Var = (kr6) this.g;
        if (kr6Var != null) {
            w4aVar2.e(kr6Var);
        }
        w4aVar2.b((lhb) this.f);
        w4aVar2.d(this.a);
        w4aVar2.c();
        map.put(Integer.valueOf(i), w4aVar2);
        return w4aVar2;
    }

    public qz4(Context context) {
        this.b = context;
        this.c = u70.c;
    }

    public qz4(aac aacVar, y8j y8jVar, k67 k67Var, k67 k67Var2) {
        this.b = aacVar;
        this.c = y8jVar;
        this.d = k67Var;
        this.e = k67Var2;
    }
}
