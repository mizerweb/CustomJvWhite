package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import one.me.android.join.JoinChatWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jw2 implements tg4, r89, t65, gv9, sxe, hfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jw2(long j, Object obj, ha9 ha9Var, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.d = ha9Var;
    }

    @Override // defpackage.hfh
    public Object a() {
        z18 z18Var = (z18) this.c;
        ij0 ij0Var = (ij0) this.d;
        uxe uxeVar = (uxe) z18Var.c;
        long jI = ((pt3) z18Var.g).i() + this.b;
        uxeVar.getClass();
        uxeVar.A(new gw2(jI, ij0Var));
        return null;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        qw2 qw2Var = (qw2) this.c;
        sfa sfaVar = (sfa) this.d;
        tw2 tw2Var = (tw2) obj;
        if (sfaVar == null) {
            tw2Var.i0 = 0L;
            return;
        }
        sfa sfaVarF = ((qfa) qw2Var.u.get()).f(this.b, tw2Var.i0);
        if (sfaVarF == null || sfaVar.c > sfaVarF.c) {
            tw2Var.i0 = sfaVar.b;
        }
    }

    @Override // defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((he9) this.d).a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.b;
            if (z) {
                sQLiteDatabase.execSQL(nbh.s(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        e38Var.F(((jv9) this.c).c, i, ((ry9) this.d).d(true), this.b);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).L((wf) this.c, this.d, this.b);
    }

    @Override // defpackage.t65
    public Object t() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        long j = this.b;
        switch (i) {
            case 2:
                return new JoinChatWidget(j, (String) obj2, (ha9) obj);
            case 3:
            default:
                return new ProfileEditScreen(j, (nnd) obj2, (ha9) obj);
            case 4:
                kmd kmdVar = (kmd) obj2;
                ha9 ha9Var = (ha9) obj;
                int i2 = imd.$EnumSwitchMapping$0[kmdVar.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        return sbi.a;
                    }
                    ore.o();
                    return null;
                }
                return new ProfileAvatarsScreen(j, kmdVar, ha9Var);
            case 5:
                p63 p63Var = (p63) obj2;
                ha9 ha9Var2 = (ha9) obj;
                return p63Var == p63.ADMIN ? new ChatAdminsScreen(j, ha9Var2) : new ChatMembersScreen(j, p63Var, ha9Var2);
        }
    }

    public /* synthetic */ jw2(Enum r1, long j, ha9 ha9Var, int i) {
        this.a = i;
        this.c = r1;
        this.b = j;
        this.d = ha9Var;
    }

    public /* synthetic */ jw2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
