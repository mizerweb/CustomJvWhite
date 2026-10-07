package defpackage;

import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uv2 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        s9h s9hVarJ;
        boolean z = false;
        z = false;
        z = false;
        switch (this.a) {
            case 0:
                qw2 qw2Var = (qw2) this.b;
                k8b k8bVar = (k8b) this.c;
                Long l = (Long) obj;
                sfa sfaVar = (sfa) obj2;
                qw2Var.getClass();
                if (k8bVar.b(l.longValue()) >= 0) {
                    long jC = k8bVar.c(l.longValue());
                    if (sfaVar != null) {
                        ((pvb) qw2Var.r.get()).y(jC, Collections.singletonList(Long.valueOf(sfaVar.b)));
                        gm0.n("qw2", "syncPin, chatId = " + jC);
                    }
                }
                return sbi.a;
            case 1:
                ek4 ek4Var = (ek4) this.b;
                wj4 wj4Var = (wj4) ((zsj) this.c).g;
                long jLongValue = ((Long) obj).longValue();
                View view = (View) obj2;
                if (ek4Var.k) {
                    wj4Var.K0();
                } else if (ek4Var.f != null) {
                    wj4Var.h0(jLongValue);
                } else {
                    wj4Var.j0(jLongValue, view);
                }
                return sbi.a;
            case 2:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.b;
                x9h x9hVar = (x9h) this.c;
                View view2 = (View) obj;
                u9h u9hVar = (u9h) obj2;
                zv8[] zv8VarArr = MessageWriteWidget.I;
                sbi sbiVar = sbi.a;
                if (messageWriteWidget.getView() != null) {
                    fik fikVar = x9hVar.g;
                    tha thaVarT1 = messageWriteWidget.t1();
                    fikVar.getClass();
                    CharSequence text = thaVarT1.getText();
                    SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
                    int iIntValue = ((Number) thaVarT1.getMessagePosition().getValue()).intValue();
                    if (spannableStringValueOf != null && (s9hVarJ = fik.j(spannableStringValueOf, iIntValue, u9hVar)) != null) {
                        x9hVar.G(new r9h(view2, u9hVar));
                        thaVarT1.post(new ai(thaVarT1, spannableStringValueOf.getSpanEnd(s9hVarJ), 16));
                    }
                }
                return sbiVar;
            case 3:
                c7k c7kVar = (c7k) this.b;
                kva kvaVar = (kva) this.c;
                ((Long) obj).getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                long j = kvaVar.d;
                MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) c7kVar.b;
                zv8[] zv8VarArr2 = MessagesSettingsScreen.p;
                bwa bwaVarQ1 = messagesSettingsScreen.q1();
                if (j == R.id.oneme_messages_settings_send_by_enter) {
                    bwaVarQ1.c.c("app.messages.send.by.enter", zBooleanValue);
                } else if (j == R.id.oneme_messages_settings_fast_reaction_enable) {
                    bwaVarQ1.D(zBooleanValue);
                } else {
                    bwaVarQ1.getClass();
                }
                return sbi.a;
            case 4:
                StringBuilder sb = (StringBuilder) this.b;
                wfe wfeVar = (wfe) this.c;
                sb.append(wfeVar.a + " \"" + ((String) obj) + "\": \"" + obj2 + "\"");
                wfeVar.a = ",";
                return sbi.a;
            case 5:
                z5d z5dVar = (z5d) this.b;
                af7 af7Var = (af7) this.c;
                KeyEvent keyEvent = (KeyEvent) obj2;
                if (((Integer) obj).intValue() == 67 && keyEvent.getAction() == 0 && z5dVar.b.getText().length() == 0) {
                    if (af7Var != null) {
                        af7Var.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                d6d d6dVar = (d6d) this.b;
                z5d z5dVar2 = (z5d) this.c;
                if (((MotionEvent) obj2).getAction() == 0) {
                    uik uikVar = d6dVar.w;
                    if (uikVar != null) {
                        ((PollCreateScreen) uikVar.b).l.s(d6dVar);
                    }
                    p0m.a(z5dVar2, kt7.DRAG_START);
                }
                return Boolean.FALSE;
            case 7:
                yfd yfdVar = (yfd) this.b;
                l8b l8bVar = (l8b) this.c;
                long jLongValue2 = ((Long) obj).longValue();
                qfd qfdVar = (qfd) obj2;
                if (!yfdVar.x(jLongValue2, qfdVar)) {
                    return qfd.a(qfdVar, 3);
                }
                qfd qfdVarC = qfdVar.c();
                l8bVar.l(jLongValue2, qfdVarC);
                return qfdVarC;
            case 8:
                yfd yfdVar2 = (yfd) this.b;
                k9d k9dVar = (k9d) this.c;
                Long l2 = (Long) obj;
                f9b f9bVar = (f9b) obj2;
                if (f9bVar == null) {
                    return null;
                }
                qfd qfdVar2 = (qfd) f9bVar.getValue();
                if (qfdVar2 != null && qfdVar2.b == agd.OFFLINE) {
                    yfdVar2.G.put(l2, Long.valueOf(((s7f) ((et3) yfdVar2.z.getValue())).f()));
                    f9bVar.setValue(qfd.a(qfdVar2, 1));
                    k9dVar.invoke();
                }
                return f9bVar;
            case 9:
                dge dgeVar = (dge) this.b;
                ele eleVar = (ele) this.c;
                i64 i64Var = (i64) obj2;
                if (i64Var != null) {
                    return i64Var;
                }
                i64 i64Var2 = new i64();
                i64Var2.Y(new os1(dgeVar, eleVar, i64Var2, 16));
                dgeVar.i.c(eleVar);
                return i64Var2;
            case 10:
                Object obj3 = this.b;
                String str = (String) this.c;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap(1);
                }
                ((Set) concurrentHashMap.computeIfAbsent(obj3, new f05(11, new skd(24)))).add(str);
                return concurrentHashMap;
            case 11:
                wjf wjfVar = (wjf) this.b;
                ylc ylcVar = wjfVar.h;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Long l3 = (Long) obj;
                ylc ylcVar2 = (ylc) obj2;
                if (ylcVar2 == null || ylcVar2.equals(ylcVar)) {
                    return ylcVar;
                }
                long jLongValue3 = ((Number) ylcVar2.a).longValue();
                long jLongValue4 = ((Number) ylcVar2.b).longValue();
                long j2 = wjfVar.e;
                if (jLongValue4 <= j2 && (jLongValue4 != j2 || jLongValue3 == wjfVar.d)) {
                    return ylcVar;
                }
                linkedHashSet.add(l3);
                return ylcVar2;
            case 12:
                vo8 vo8Var = (vo8) this.b;
                vo8 vo8Var2 = (vo8) obj2;
                String str2 = ((pdh) this.c).b;
                if (vo8Var2 != vo8Var) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str2, qt4.l("keep current job ", vo8Var2 != null ? vo8Var2.hashCode() : 0, vo8Var.hashCode(), "; tried to remove "), null);
                        }
                    }
                    return vo8Var2;
                }
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 == null) {
                    return null;
                }
                je9 je9Var2 = je9.d;
                if (!a4cVar2.b(je9Var2)) {
                    return null;
                }
                a4cVar2.c(je9Var2, str2, c0a.k(vo8Var2.hashCode(), "removed job ", " from mapping"), null);
                return null;
            default:
                wsj wsjVar = (wsj) this.b;
                vsj vsjVar = (vsj) this.c;
                ((Long) obj).getClass();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                sbi sbiVar2 = sbi.a;
                usj usjVar = wsjVar.u;
                ssj ssjVar = usjVar instanceof ssj ? (ssj) usjVar : null;
                if (ssjVar != null) {
                    vsjVar.a(ssjVar, zBooleanValue2);
                }
                return sbiVar2;
        }
    }
}
