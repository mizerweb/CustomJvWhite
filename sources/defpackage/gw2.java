package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import one.me.messages.list.ui.MessagesListWidget;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gw2 implements tg4, r89, gv9, xz9, r4a, i8c, sxe {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gw2(long j, ij0 ij0Var) {
        this.a = 7;
        this.b = j;
        this.c = ij0Var;
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tw2 tw2Var = (tw2) obj;
                tw2Var.e0 = null;
                tw2Var.f0 = j;
                tw2Var.g0 = ((qw2) obj2).p.a.f();
                break;
            default:
                ose oseVar = (ose) obj2;
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    oseVar.j((zic) it.next(), j);
                }
                break;
        }
    }

    @Override // defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        ij0 ij0Var = (ij0) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.b));
        String str = ij0Var.a;
        vhd vhdVar = ij0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(yhd.a(vhdVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(yhd.a(vhdVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.gv9
    public void c(e38 e38Var, int i) {
        jv9 jv9Var = (jv9) this.c;
        e38Var.Z(jv9Var.c, i, this.b);
    }

    @Override // defpackage.xz9
    public wz9 g() {
        wz9 wz9Var = (wz9) ((b2a) this.c).r.get();
        return wz9Var == null ? new wz9(0L, 0L, b2a.A, this.b) : wz9Var;
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).v((wf) this.c, this.b);
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        return d3aVar.r(i2aVar, c98.r((ry9) this.c), 0, this.b);
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        MessagesListWidget messagesListWidget = (MessagesListWidget) this.c;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        hqc hqcVar = (hqc) messagesListWidget.F1().X2.getValue();
        boolean zA = j0m.a(j8cVar);
        long j = this.b;
        if (zA) {
            yab.i0(hqcVar.a, hqcVar.b, 0, new fqc(hqcVar, Long.valueOf(j), null, 0), 2);
        } else {
            yab.i0(hqcVar.a, hqcVar.b, 0, new fqc(hqcVar, Long.valueOf(j), null, 1), 2);
        }
    }

    public /* synthetic */ gw2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
