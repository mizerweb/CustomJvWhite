package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class i5d {
    public final String a;
    public final Object b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final ny8 f;
    public final ny8 g;
    public final rv8 h;
    public final ny8 i;
    public final e5d j;
    public final ifh k;
    public final ifh l;
    public final ifh m;
    public final ifh n;
    public volatile int o = 1;
    public final wme p = new wme(new fl9(0, this, i5d.class, "update", "update()Ljava/lang/Object;", 0, 5));
    public final ifh q;
    public final ifh r;

    public i5d(String str, Object obj, int i, boolean z, boolean z2, ny8 ny8Var, ny8 ny8Var2, sr3 sr3Var, ifh ifhVar, e5d e5dVar) {
        this.a = str;
        this.b = obj;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = sr3Var;
        this.i = ifhVar;
        this.j = e5dVar;
        final int i2 = 0;
        this.k = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                i5d i5dVar = this.b;
                switch (i3) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
        final int i3 = 1;
        this.l = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                i5d i5dVar = this.b;
                switch (i4) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
        final int i4 = 2;
        this.m = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                i5d i5dVar = this.b;
                switch (i5) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
        final int i5 = 3;
        this.n = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                i5d i5dVar = this.b;
                switch (i6) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
        final int i6 = 4;
        this.q = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                i5d i5dVar = this.b;
                switch (i7) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
        final int i7 = 5;
        this.r = new ifh(new af7(this) { // from class: h5d
            public final /* synthetic */ i5d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                i5d i5dVar = this.b;
                switch (i8) {
                    case 0:
                        return (SharedPreferences) i5dVar.j.g.getValue();
                    case 1:
                        return (SharedPreferences) i5dVar.j.f.getValue();
                    case 2:
                        return i5dVar.j.q();
                    case 3:
                        return i5dVar.j.a;
                    case 4:
                        return p90.a(i5dVar.c());
                    default:
                        return new r8e((f9b) i5dVar.q.getValue());
                }
            }
        });
    }

    public final void a(Object obj) {
        Object obj2;
        ifh ifhVar = this.m;
        if (obj == null) {
            ((SharedPreferences) ifhVar.getValue()).edit().remove(this.a).commit();
            obj2 = obj;
        } else {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ifhVar.getValue()).edit();
            obj2 = obj;
            d0g.f(editorEdit, this.a, obj2, this.h, f(), this.i);
            editorEdit.commit();
        }
        if (this.o == 4) {
            ((f9b) this.q.getValue()).setValue(obj2);
        }
    }

    public final Object b(String str) {
        Object value = this.i.getValue();
        if (value != null) {
            return ((qs8) f().getValue()).a((aw8) value, str);
        }
        ore.p("Required value was null.");
        return null;
    }

    public final Object c() {
        Object objC = d0g.c(g(), this.a, null, this.h, f(), this.i);
        if (objC != null) {
            this.o = 2;
            return objC;
        }
        Object objC2 = d0g.c((SharedPreferences) this.l.getValue(), this.a, null, this.h, f(), this.i);
        if (objC2 != null) {
            this.o = 3;
            return objC2;
        }
        Object objC3 = d0g.c((SharedPreferences) this.m.getValue(), this.a, null, this.h, f(), this.i);
        if (objC3 != null) {
            this.o = 4;
            return objC3;
        }
        this.o = 5;
        return this.b;
    }

    public final String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        aw8 aw8Var = (aw8) this.i.getValue();
        if (aw8Var != null) {
            return ((qs8) f().getValue()).b(aw8Var, obj);
        }
        if (obj instanceof long[]) {
            return a.f1(57, (long[]) obj);
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i2 = 0;
            while (i < length) {
                int i3 = iArr[i];
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf(i3));
                i++;
            }
            sb.append((CharSequence) "]");
            return sb.toString();
        }
        if (!(obj instanceof float[])) {
            if (obj instanceof Object[]) {
                return a.h1((Object[]) obj, null, "[", "]", null, 57);
            }
            return obj instanceof Map ? f55.E((Map) obj).toString() : obj.toString();
        }
        float[] fArr = (float[]) obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int length2 = fArr.length;
        int i4 = 0;
        while (i < length2) {
            float f = fArr[i];
            i4++;
            if (i4 > 1) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) String.valueOf(f));
            i++;
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public final jt8 e(Object obj) {
        if (obj == null) {
            return zt8.INSTANCE;
        }
        aw8 aw8Var = (aw8) this.i.getValue();
        if (aw8Var != null) {
            qs8 qs8Var = (qs8) f().getValue();
            qs8Var.getClass();
            return pzl.b(qs8Var, obj, aw8Var);
        }
        if (obj instanceof Number) {
            return kt8.b((Number) obj);
        }
        if (obj instanceof String) {
            return kt8.c((String) obj);
        }
        if (!(obj instanceof Set)) {
            return obj instanceof Map ? ((qs8) f().getValue()).c(f55.E((Map) obj).toString()) : kt8.c(obj.toString());
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kt8.c(String.valueOf(it.next())));
        }
        return new ss8(arrayList);
    }

    public final ny8 f() {
        return (ny8) this.n.getValue();
    }

    public final SharedPreferences g() {
        return (SharedPreferences) this.k.getValue();
    }

    public final gjg h() {
        return (gjg) this.r.getValue();
    }

    public final Object i() {
        return this.e ? this.p.getValue() : k();
    }

    public final void j(Object obj) {
        Object obj2;
        this.o = 2;
        if (obj == null) {
            g().edit().remove(this.a).commit();
            obj2 = obj;
        } else {
            SharedPreferences.Editor editorEdit = g().edit();
            obj2 = obj;
            d0g.f(editorEdit, this.a, obj2, this.h, f(), this.i);
            editorEdit.commit();
        }
        ((f9b) this.q.getValue()).setValue(obj2);
    }

    public final Object k() {
        Object objC = c();
        ((f9b) this.q.getValue()).setValue(objC);
        return objC;
    }
}
