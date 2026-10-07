package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.polls.screens.create.PollCreateScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class q7d {
    public final /* synthetic */ PollCreateScreen a;

    public q7d(PollCreateScreen pollCreateScreen) {
        this.a = pollCreateScreen;
    }

    public final boolean a(Long l) {
        Object value;
        l7d l7dVar;
        zv8[] zv8VarArr = PollCreateScreen.n;
        y7d y7dVarP1 = this.a.p1();
        mjg mjgVar = y7dVarP1.d;
        if (l != null && ((l7dVar = (l7d) ww3.D1(((x8d) mjgVar.getValue()).a)) == null || l7dVar.c != l.longValue())) {
            return false;
        }
        List list = ((x8d) mjgVar.getValue()).a;
        if (list.size() >= 12) {
            gm0.Y(y7dVarP1.j, "addNewAnswer fail, answersList is limited");
            y7dVarP1.i = false;
            y7dVarP1.h = null;
            return false;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            qr7.d();
            return false;
        }
        long j = ((l7d) it.next()).c;
        while (it.hasNext()) {
            long j2 = ((l7d) it.next()).c;
            if (j < j2) {
                j = j2;
            }
        }
        long j3 = j + 1;
        l7d l7dVar2 = new l7d("", new tnh(R.string.oneme_poll_create__answer_hint), 6, j3);
        y7dVarP1.i = true;
        y7dVarP1.h = Long.valueOf(j3);
        do {
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, x8d.a((x8d) value, ww3.H1(l7dVar2, list), false, 2)));
        return true;
    }

    public final void b(long j, String str) {
        Object value;
        x8d x8dVar;
        Object next;
        Object value2;
        x8d x8dVar2;
        zv8[] zv8VarArr = PollCreateScreen.n;
        y7d y7dVarP1 = this.a.p1();
        y7dVarP1.getClass();
        long j2 = z5c.c;
        mjg mjgVar = y7dVarP1.d;
        if (j == j2) {
            do {
                value2 = mjgVar.getValue();
                x8dVar2 = (x8d) value2;
                x8dVar2.c = str;
            } while (!mjgVar.h(value2, x8dVar2));
            return;
        }
        do {
            value = mjgVar.getValue();
            x8dVar = (x8d) value;
            Iterator it = x8dVar.a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((l7d) next).c != j);
            l7d l7dVar = (l7d) next;
            if (l7dVar != null) {
                l7dVar.d = str;
            }
        } while (!mjgVar.h(value, x8dVar));
    }
}
