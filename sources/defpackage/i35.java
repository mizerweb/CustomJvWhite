package defpackage;

import one.me.sdk.database.OneMeRoomDatabase;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class i35 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ i35(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new k35(h5Var);
            case 1:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).G();
            case 2:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).t();
            case 3:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).Z();
            case 4:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).a0();
            case 5:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).A();
            case 6:
                return new qki(h5Var.d(HttpStatus.SC_UNPROCESSABLE_ENTITY));
            case 7:
                return (nka) h5Var.c(HttpStatus.SC_LOCKED);
            case 8:
                return new ovi((evi) h5Var.c(HttpStatus.SC_FAILED_DEPENDENCY));
            case 9:
                return new i0j((f0j) h5Var.c(425));
            case 10:
                return new xm((pvb) h5Var.c(146), (ql) h5Var.c(418), (en) h5Var.c(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE), (j7e) h5Var.c(HttpStatus.SC_METHOD_FAILURE), (et3) h5Var.c(85), (xhh) h5Var.c(23), (jn) h5Var.c(309), (yt4) h5Var.c(48));
            case 11:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).f0();
            case 12:
                return new utd(h5Var.d(HttpStatus.SC_PRECONDITION_FAILED), (xhh) h5Var.c(23), h5Var.d(132), (ite) h5Var.c(90), h5Var.d(85), h5Var.d(100));
            case 13:
                return new ftc(h5Var.d(HttpStatus.SC_REQUEST_URI_TOO_LONG));
            case 14:
                return new nv0(new qv0(h5Var.d(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE), 0));
            case 15:
                return new mba(new qv0(h5Var.d(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE), 1));
            case 16:
                return new hre(h5Var.d(229), h5Var.d(HttpStatus.SC_NOT_FOUND), h5Var.d(432), h5Var.d(430), h5Var.d(433));
            case 17:
                return new ose(h5Var.d(433), h5Var.d(435), h5Var.d(HttpStatus.SC_NOT_FOUND), h5Var.d(HttpStatus.SC_METHOD_NOT_ALLOWED), (m7f) h5Var.c(300), h5Var.d(54), h5Var.d(23), h5Var.d(320), h5Var.d(77));
            case 18:
                return new mre(h5Var.d(436));
            case 19:
                return new sse(h5Var.d(437), h5Var.d(HttpStatus.SC_NOT_FOUND), h5Var.d(23));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new ate(h5Var.d(438));
            case 21:
                return new vse(h5Var.d(439));
            case 22:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).y();
            case 23:
                return new xse(h5Var.d(421), h5Var.d(HttpStatus.SC_NOT_FOUND));
            case 24:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).F();
            case 25:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).L();
            case 26:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).D();
            case 27:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).E();
            case 28:
                return new g65(h5Var.a(3));
            default:
                return new x65((g65) h5Var.c(181), (d1c) h5Var.c(183));
        }
    }
}
