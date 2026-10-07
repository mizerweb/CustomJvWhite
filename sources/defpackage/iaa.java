package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iaa implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iaa(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean zAddLinks;
        qxc qxcVar;
        ynh ynhVar;
        int i = this.a;
        boolean z = false;
        zD = false;
        boolean zD = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        int i2 = 1;
        sbi sbiVar = sbi.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                sfa sfaVar = (sfa) obj2;
                o63 o63Var = (o63) obj;
                if (o63Var.a.a != ((s7f) ((qaa) obj3).h).t() && sfaVar.c <= o63Var.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                long[] jArr = (long[]) obj2;
                vxe vxeVarO0 = ((qxe) obj).O0((String) obj3);
                try {
                    for (long j : jArr) {
                        vxeVarO0.c(i2, j);
                        i2++;
                    }
                    int iE = qyj.E(vxeVarO0, "message_id");
                    int iE2 = qyj.E(vxeVarO0, "counter");
                    int iE3 = qyj.E(vxeVarO0, "updated_at");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new zea((int) vxeVarO0.getLong(iE2), vxeVarO0.getLong(iE), vxeVarO0.getLong(iE3)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 2:
                ((yea) obj3).b.c((qxe) obj, (ArrayList) obj2);
                return sbiVar;
            case 3:
                return Long.valueOf(((yea) obj3).b.e((qxe) obj, (zea) obj2));
            case 4:
                RecyclerView recyclerView = (RecyclerView) obj2;
                if (((k79) ((MessageContextMenuBottomSheet) obj3).t1.F(((Integer) obj).intValue())) instanceof k8a) {
                    return recyclerView.getContext().getString(R.string.chat_screen_read_participants_read_header);
                }
                return null;
            case 5:
                ((nka) obj3).b.d((qxe) obj, (jka) obj2);
                return sbiVar;
            case 6:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj3;
                fn9 fn9Var = new fn9((EditText) obj, ((o1c) messageWriteWidget.n.getValue()).a, ((Boolean) ((e5d) messageWriteWidget.m.getValue()).o2.a(e5d.S6[170]).i()).booleanValue(), new uik(18, messageWriteWidget), !sol.d((t3f) obj2));
                messageWriteWidget.w = fn9Var;
                return fn9Var;
            case 7:
                return Long.valueOf(((toa) obj3).b.e((qxe) obj, (gga) obj2));
            case 8:
                return Integer.valueOf(((toa) obj3).e.G((qxe) obj, (zia) obj2));
            case 9:
                ((toa) obj3).f.G((qxe) obj, (jfi) obj2);
                return sbiVar;
            case 10:
                return Integer.valueOf(((toa) obj3).g.G((qxe) obj, (cei) obj2));
            case 11:
                return Integer.valueOf(((toa) obj3).h.G((qxe) obj, (rfi) obj2));
            case 12:
                ((npa) obj3).h.remove((jpa) obj2);
                return sbiVar;
            case 13:
                ((sxa) obj3).b.d((qxe) obj, (txa) obj2);
                return sbiVar;
            case 14:
                p5b p5bVar = (p5b) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                Object objInvoke = ((m) obj3).invoke(num);
                if (objInvoke != null && ((o5b) p5bVar.b.a.getValue()).b.contains(objInvoke)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 15:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ((s81) obj3).invoke(num2, ((o5b) ((p5b) obj2).b.a.getValue()).b);
                return sbiVar;
            case 16:
                ((sgg) obj3).b(null);
                ((njd) obj2).c((og4) obj);
                return sbiVar;
            case 17:
                zj7 zj7Var = (zj7) obj2;
                ft0 ft0Var = ((vfb) obj3).n1;
                if (ft0Var != null) {
                    MessagesListWidget messagesListWidget = (MessagesListWidget) ft0Var.a;
                    zv8[] zv8VarArr = MessagesListWidget.T1;
                    a8j.x(messagesListWidget.F1().G2, new ufc(zj7Var));
                }
                return sbiVar;
            case 18:
                ((pnb) obj3).b.d((qxe) obj, (xn6) obj2);
                return sbiVar;
            case 19:
                ((tnb) obj3).b.d((qxe) obj, (xmb) obj2);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Pattern pattern = (Pattern) obj3;
                String str = (String) obj2;
                Spannable spannable = (Spannable) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    zAddLinks = Linkify.addLinks(spannable, pattern, str);
                } else if (i3 >= 28) {
                    zAddLinks = Linkify.addLinks(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                } else {
                    if (str == null) {
                        str = "";
                    }
                    String[] strArr = {str.toLowerCase(Locale.ROOT)};
                    Matcher matcher = pattern.matcher(spannable);
                    boolean z4 = false;
                    while (matcher.find()) {
                        int iStart = matcher.start();
                        int iEnd = matcher.end();
                        String strGroup = matcher.group(0);
                        if (strGroup != null) {
                            spannable.setSpan(new URLSpan(mmc.e(strGroup, strArr, matcher)), iStart, iEnd, 33);
                            z4 = true;
                        }
                    }
                    zAddLinks = z4;
                }
                return Boolean.valueOf(zAddLinks);
            case 21:
                j7c j7cVar = (j7c) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                if (str3.length() > 0 && j7cVar.c().g(str3, str2)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 22:
                ((kic) obj3).b.c((qxe) obj, (List) obj2);
                return sbiVar;
            case 23:
                String str4 = (String) obj;
                str4.getClass();
                ((co0) obj3).d.b((y3e) obj2, "P2PNetworkStatusReporter", str4);
                return sbiVar;
            case 24:
                Set set = (Set) obj2;
                vxe vxeVarO1 = ((qxe) obj).O0((String) obj3);
                int i4 = 3;
                try {
                    vxeVarO1.c(1, qt4.D(3));
                    vxeVarO1.c(2, qt4.D(1));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        vxeVarO1.B(i4, (String) it.next());
                        i4++;
                    }
                    vxeVarO1.M0();
                    return sbiVar;
                } finally {
                    vxeVarO1.close();
                }
            case 25:
                nuc nucVar = (nuc) obj3;
                Iterator it2 = ((ArrayList) obj2).iterator();
                while (it2.hasNext()) {
                    ch3.G(nucVar.a, false, true, new aa2(((Number) it2.next()).longValue(), 15));
                }
                return sbiVar;
            case 26:
                PickerContactsListWidget pickerContactsListWidget = (PickerContactsListWidget) obj3;
                RecyclerView recyclerView2 = (RecyclerView) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int iL = pickerContactsListWidget.j.l();
                oxc oxcVar = pickerContactsListWidget.h;
                int iL2 = oxcVar.l() + iL;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.p1().l.a.getValue();
                if ((charSequence == null || charSequence.length() == 0) && iIntValue >= iL && iIntValue < iL2 && (qxcVar = (qxc) oxcVar.J(iIntValue - iL)) != null && (ynhVar = qxcVar.c) != null) {
                    return ynhVar.d(recyclerView2);
                }
                return null;
            case 27:
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                zv8[] zv8VarArr2 = PickerMembersListWidget.p;
                nee adapter = ((k96) obj3).getAdapter();
                oxc oxcVar2 = pickerMembersListWidget.i;
                if (adapter != oxcVar2) {
                    oxcVar2 = pickerMembersListWidget.j;
                }
                if (oxcVar2.l() > iIntValue2 && iIntValue2 >= 0) {
                    zD = ((m8b) pickerMembersListWidget.q1().i.a.getValue()).d(((qxc) ((k79) oxcVar2.F(iIntValue2))).a);
                }
                return Boolean.valueOf(zD);
            case 28:
                PickerMembersListWidget pickerMembersListWidget2 = (PickerMembersListWidget) obj3;
                RecyclerView recyclerView3 = (RecyclerView) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                zv8[] zv8VarArr3 = PickerMembersListWidget.p;
                txc txcVarQ1 = pickerMembersListWidget2.q1();
                oxc oxcVar3 = pickerMembersListWidget2.i;
                CharSequence charSequence2 = (CharSequence) txcVarQ1.l.a.getValue();
                if ((charSequence2 == null || charSequence2.length() == 0) && iIntValue3 < oxcVar3.l()) {
                    return ((qxc) ((k79) oxcVar3.F(iIntValue3))).c.d(recyclerView3);
                }
                return null;
            default:
                e7d e7dVar = (e7d) obj2;
                ((q8d) obj3).a.invoke(new ina(((Integer) obj).intValue(), e7dVar, e7dVar.a));
                return sbiVar;
        }
    }
}
