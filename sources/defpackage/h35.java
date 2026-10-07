package defpackage;

import android.content.Context;
import androidx.work.impl.model.WorkersQueueDao;
import one.me.sdk.database.OneMeRoomDatabase;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class h35 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ h35(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).Q();
            case 1:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).T();
            case 2:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).K();
            case 3:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).V();
            case 4:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).O();
            case 5:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).u();
            case 6:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).r();
            case 7:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).s();
            case 8:
                return new w6c((Context) h5Var.c(7), (eh9) h5Var.c(342), (i1c) h5Var.c(452), h5Var.d(320), h5Var.d(29), (wmi) h5Var.c(139), (ha9) h5Var.c(30), new ifh(new ic1(h5Var, 4)), new ifh(new ic1(h5Var, 5)), new ifh(new ic1(h5Var, 6)), (a1c) h5Var.c(453), h5Var.d(72));
            case 9:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).R();
            case 10:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).Y();
            case 11:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).c0();
            case 12:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).I();
            case 13:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).d0();
            case 14:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).e0();
            case 15:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).X();
            case 16:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).B();
            case 17:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).S();
            case 18:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).M();
            case 19:
                return new j35(h5Var);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).U();
            case 21:
                return (WorkersQueueDao) ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).l.getValue();
            case 22:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).w();
            case 23:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).J();
            case 24:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).x();
            case 25:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).H();
            case 26:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).z();
            case 27:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).P();
            case 28:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).b0();
            default:
                return ((OneMeRoomDatabase) h5Var.c(HttpStatus.SC_FORBIDDEN)).W();
        }
    }
}
