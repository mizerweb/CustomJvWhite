package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;
import one.me.android.logout.LogoutScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ch9 implements t65, zi9, r89, rv9, mf7, c3a, r4a, qg4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ch9(String str, int i, int i2, tz9 tz9Var) {
        this.a = 18;
    }

    public static /* synthetic */ void b(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // defpackage.c3a
    public void a(h2a h2aVar, int i) {
        switch (this.a) {
            case 13:
                h2aVar.getClass();
                break;
            case 14:
                h2aVar.b(i);
                break;
            default:
                h2aVar.getClass();
                break;
        }
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        j4d j4dVar = (j4d) obj;
        switch (this.a) {
            case 19:
                j4dVar.w();
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                j4dVar.i0();
                break;
            case 21:
                j4dVar.p();
                break;
            case 22:
            case 27:
            default:
                j4dVar.y();
                break;
            case 23:
                j4dVar.c0();
                break;
            case 24:
                j4dVar.J();
                break;
            case 25:
                j4dVar.l();
                break;
            case 26:
                j4dVar.i();
                break;
            case 28:
                j4dVar.I();
                break;
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 9:
                k4h k4hVar = (k4h) obj;
                k4hVar.getClass();
                Bundle bundle = new Bundle();
                int i = k4hVar.a;
                if (i != 0) {
                    bundle.putInt(k4h.d, i);
                }
                int i2 = k4hVar.b;
                if (i2 != 0) {
                    bundle.putInt(k4h.e, i2);
                }
                int i3 = k4hVar.c;
                if (i3 != 0) {
                    bundle.putInt(k4h.f, i3);
                }
                return bundle;
            case 10:
                oy9 oy9Var = (oy9) obj;
                oy9Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(oy9.h, oy9Var.a);
                String str = oy9Var.b;
                if (str != null) {
                    bundle2.putString(oy9.i, str);
                }
                String str2 = oy9Var.c;
                if (str2 != null) {
                    bundle2.putString(oy9.j, str2);
                }
                int i4 = oy9Var.d;
                if (i4 != 0) {
                    bundle2.putInt(oy9.k, i4);
                }
                int i5 = oy9Var.e;
                if (i5 != 0) {
                    bundle2.putInt(oy9.l, i5);
                }
                String str3 = oy9Var.f;
                if (str3 != null) {
                    bundle2.putString(oy9.m, str3);
                }
                String str4 = oy9Var.g;
                if (str4 != null) {
                    bundle2.putString(oy9.n, str4);
                }
                return bundle2;
            case 11:
                Bundle bundle3 = (Bundle) obj;
                return new k4h(bundle3.getInt(k4h.d, 0), bundle3.getInt(k4h.e, 0), bundle3.getInt(k4h.f, 0));
            default:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(oy9.h);
                uri.getClass();
                String string = bundle4.getString(oy9.i);
                String string2 = bundle4.getString(oy9.j);
                int i6 = bundle4.getInt(oy9.k, 0);
                int i7 = bundle4.getInt(oy9.l, 0);
                String string3 = bundle4.getString(oy9.m);
                String string4 = bundle4.getString(oy9.n);
                ny9 ny9Var = new ny9();
                ny9Var.a = uri;
                ny9Var.b = uya.n(string);
                ny9Var.c = string2;
                ny9Var.d = i6;
                ny9Var.e = i7;
                ny9Var.f = string3;
                ny9Var.g = string4;
                return new oy9(ny9Var);
        }
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        switch (this.a) {
            case 3:
                ((j3d) obj).z(1);
                break;
            case 4:
                ((j3d) obj).j0(0.0f);
                break;
            default:
                ((j3d) obj).g();
                break;
        }
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        switch (this.a) {
            case 16:
                f2a f2aVar = d3aVar.e;
                d3aVar.t(i2aVar);
                f2aVar.getClass();
                return rx8.J(new wmf(-6));
            case 17:
                d3aVar.getClass();
                throw new ClassCastException();
            case 18:
                d3aVar.getClass();
                throw new ClassCastException();
            case 19:
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
            default:
                d3aVar.getClass();
                throw new ClassCastException();
            case 22:
                return d3aVar.n(i2aVar);
        }
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        switch (this.a) {
            case 6:
                jv9Var.i.f(26, new ch9(5));
                return;
            case 7:
                iu9 iu9Var = jv9Var.a;
                Objects.requireNonNull(iu9Var);
                iu9Var.S(new e6(21, iu9Var));
                return;
            default:
                throw new ClassCastException();
        }
    }

    @Override // defpackage.t65
    public Object t() {
        return new LogoutScreen();
    }

    public /* synthetic */ ch9(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ ch9(int i) {
        this.a = i;
    }

    public /* synthetic */ ch9(String str, int i, tz9 tz9Var) {
        this.a = 8;
    }

    public /* synthetic */ ch9(boolean z, emf emfVar, Bundle bundle) {
        this.a = 22;
    }
}
