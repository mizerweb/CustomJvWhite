package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pma implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ pma(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [gn9, ju7] */
    /* JADX WARN: Type inference failed for: r12v3, types: [gn9, vz0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [gn9, jn8] */
    /* JADX WARN: Type inference failed for: r12v5, types: [gn9, h5h] */
    /* JADX WARN: Type inference failed for: r12v6, types: [d1b, gn9] */
    /* JADX WARN: Type inference failed for: r12v7, types: [gn9, h5h] */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v18, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v23, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.text.Spannable, android.text.SpannableString, java.lang.CharSequence] */
    @Override // defpackage.af7
    public final Object invoke() {
        ?? string;
        int i = this.a;
        sbi sbiVar = sbi.a;
        a8g a8gVar = pq3.j;
        ArrayList arrayList = null;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (i) {
            case 0:
                return new qj9(messageWriteWidget.g.getAccessor().d(23), ((Boolean) messageWriteWidget.E.getValue()).booleanValue(), messageWriteWidget.getContext(), new pma(messageWriteWidget, 1));
            case 1:
                fn9 fn9Var = messageWriteWidget.w;
                if (fn9Var != null) {
                    boolean zC = fn9Var.c();
                    LinkedHashSet linkedHashSet = en9.c;
                    arrayList = new ArrayList();
                    for (Object obj : linkedHashSet) {
                        int i2 = ((en9) obj).a;
                        if (i2 != R.id.markdown_quote || zC) {
                            if (i2 != R.id.markdown_link || fn9Var.e) {
                                arrayList.add(obj);
                            }
                        }
                    }
                }
                return arrayList == null ? r66.a : arrayList;
            case 2:
                zv8[] zv8VarArr = MessageWriteWidget.I;
                if (((rj9) messageWriteWidget.u1().g.getValue()).b == 1) {
                    nma.L(messageWriteWidget.A1(), false, 3);
                    return sbiVar;
                }
                qj9 qj9VarU1 = messageWriteWidget.u1();
                mjg mjgVar = qj9VarU1.g;
                int iD = qt4.D(((rj9) mjgVar.getValue()).b);
                if (iD == 0) {
                    return sbiVar;
                }
                if (iD == 1) {
                    if (!qj9VarU1.c) {
                        return sbiVar;
                    }
                    List list = ((rj9) mjgVar.getValue()).a;
                    if (list.isEmpty()) {
                        Iterable<en9> iterable = (Iterable) qj9VarU1.e.invoke();
                        ArrayList arrayList2 = new ArrayList(yw3.W0(iterable, 10));
                        for (en9 en9Var : iterable) {
                            int i3 = en9Var.a;
                            Context context = qj9VarU1.d;
                            int iOrdinal = en9Var.ordinal();
                            int i4 = en9Var.b;
                            switch (iOrdinal) {
                                case 0:
                                    string = context.getString(i4);
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 1:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new ju7(1.0f).a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 2:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new vz0().a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 3:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new jn8().a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 4:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new h5h(1).a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 5:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new d1b().a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 6:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    new h5h(0).a(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 7:
                                    string = context.getString(i4);
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 8:
                                    string = context.getString(i4);
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                case 9:
                                    string = SpannableString.valueOf(context.getString(i4));
                                    tre.o0(string, 0, string.length());
                                    continue;
                                    arrayList2.add(new wj9(i3, string));
                                    break;
                                default:
                                    ore.o();
                                    break;
                            }
                        }
                        list = arrayList2;
                    }
                    a8j.t(qj9VarU1, ((n0c) ((xhh) qj9VarU1.f.getValue())).a(), new af8(qj9VarU1, list, 3, (lq4) null), 2);
                    return sbiVar;
                }
                if (iD == 2) {
                    qj9.B(qj9VarU1, 1);
                    return sbiVar;
                }
                ore.o();
                return null;
            case 3:
                zv8[] zv8VarArr2 = MessageWriteWidget.I;
                nma nmaVarA1 = messageWriteWidget.A1();
                rt2 rt2Var = (rt2) nmaVarA1.c.getValue();
                if (rt2Var != null) {
                    a8j.x(nmaVarA1.x, new xla(rt2Var.a));
                }
                return sbiVar;
            case 4:
                return Boolean.valueOf(((nni) messageWriteWidget.j.getValue()).d.getBoolean("app.messages.send.by.enter", false));
            case 5:
                zv8[] zv8VarArr3 = MessageWriteWidget.I;
                return a8gVar.k(messageWriteWidget.getContext()).b;
            case 6:
                zv8[] zv8VarArr4 = MessageWriteWidget.I;
                return a8gVar.k(messageWriteWidget.getContext()).b;
            case 7:
                zv8[] zv8VarArr5 = MessageWriteWidget.I;
                return a8gVar.k(messageWriteWidget.getContext()).b;
            case 8:
                zv8[] zv8VarArr6 = MessageWriteWidget.I;
                z2e z2eVar = new z2e(messageWriteWidget.getContext());
                z2eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                z2eVar.setEndIconDrawable(z2eVar.getContext().getDrawable(R.drawable.icon_cross).mutate());
                z2eVar.setEndIconClickListener(new o37(22, messageWriteWidget));
                WeakHashMap weakHashMap = i7j.a;
                if (!z2eVar.isLaidOut() || z2eVar.isLayoutRequested()) {
                    z2eVar.addOnLayoutChangeListener(new xc0(z2eVar, messageWriteWidget));
                } else if (soh.c(z2eVar.getTitleView())) {
                    MessageWriteWidget.I1(z2eVar, true);
                }
                return z2eVar;
            default:
                return new sj9((ScheduledExecutorService) ((a2c) messageWriteWidget.g.getAccessor().d(27).getValue()).q.getValue(), new qma(messageWriteWidget, 4));
        }
    }
}
