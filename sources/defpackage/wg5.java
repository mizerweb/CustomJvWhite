package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.applifecycle.o.e;
import com.my.tracker.core.EngineCore;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.stickerspreview.StickerPreviewScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wg5 implements ch5, t65, hfh, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wg5(long j, nnd nndVar, mnd mndVar, ha9 ha9Var) {
        this.a = 2;
        this.c = j;
        this.b = nndVar;
        this.e = mndVar;
        this.d = ha9Var;
    }

    @Override // defpackage.hfh
    public Object a() {
        z18 z18Var = (z18) this.b;
        Iterable iterable = (Iterable) this.e;
        ij0 ij0Var = (ij0) this.d;
        uxe uxeVar = (uxe) z18Var.c;
        uxeVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(uxe.P(iterable));
            SQLiteDatabase sQLiteDatabaseL = uxeVar.l();
            sQLiteDatabaseL.beginTransaction();
            try {
                sQLiteDatabaseL.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        uxeVar.I(cursorRawQuery.getInt(0), he9.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseL.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseL.setTransactionSuccessful();
                sQLiteDatabaseL.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseL.endTransaction();
                throw th2;
            }
        }
        uxeVar.A(new gw2(((pt3) z18Var.g).i() + this.c, ij0Var));
        return null;
    }

    @Override // defpackage.ch5
    public ScheduledFuture b(rj5 rj5Var) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        bh5 bh5Var = (bh5) this.b;
        switch (i) {
            case 0:
                return bh5Var.b.schedule(new zg5(bh5Var, (Runnable) obj2, rj5Var, i2), j, (TimeUnit) obj);
            default:
                return bh5Var.b.schedule(new ls4(bh5Var, (Callable) obj2, rj5Var, i2), j, (TimeUnit) obj);
        }
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return ((d) this.b).a(this.c, (String) this.e, (e.a) this.d, insertEventTools);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    @Override // defpackage.t65
    public Object t() {
        t3f t3fVar;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i) {
            case 2:
                return new ProfileChangeLinkScreen(this.c, (nnd) obj3, (mnd) obj2, (ha9) obj);
            default:
                Bundle bundle = (Bundle) obj3;
                bdj bdjVar = (bdj) obj2;
                ha9 ha9Var = (ha9) obj;
                String string = bundle.getString("chat_scope_id");
                Long lY = sb8.Y(bundle, "chat_id");
                long jLongValue = lY != null ? lY.longValue() : 0L;
                Long lY2 = sb8.Y(bundle, "forward_id");
                long jLongValue2 = lY2 != null ? lY2.longValue() : 0L;
                if (string != null) {
                    ha9 ha9Var2 = null;
                    if (string.length() == 0) {
                        string = null;
                    }
                    if (string != null) {
                        t3fVar = new t3f(string, ha9Var2, 2);
                    } else {
                        t3fVar = t3f.e;
                    }
                } else {
                    t3fVar = t3f.e;
                }
                return new StickerPreviewScreen(this.c, jLongValue, jLongValue2, t3fVar, bdjVar, ha9Var);
        }
    }

    public /* synthetic */ wg5(bh5 bh5Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = bh5Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }

    public /* synthetic */ wg5(z18 z18Var, Iterable iterable, ij0 ij0Var, long j) {
        this.a = 4;
        this.b = z18Var;
        this.e = iterable;
        this.d = ij0Var;
        this.c = j;
    }

    public /* synthetic */ wg5(Object obj, long j, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.e = obj2;
        this.d = obj3;
    }
}
