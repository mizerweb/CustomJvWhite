package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ryc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ ryc(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        final int i2 = 0;
        final int i3 = 1;
        final PickerContactsListWidget pickerContactsListWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickerContactsListWidget.q;
                ca2 ca2Var = pickerContactsListWidget.b;
                hk4 hk4Var = (hk4) ca2Var.getAccessor().d(942).getValue();
                ny8 ny8VarE = ca2Var.e();
                ifh ifhVarD = ca2Var.getAccessor().d(133);
                vv vvVar = pickerContactsListWidget.a;
                zv8 zv8Var = PickerContactsListWidget.q[0];
                return new vyc(hk4Var, ny8VarE, ifhVarD, (py2) vvVar.a(pickerContactsListWidget));
            case 1:
                ca2 ca2Var2 = pickerContactsListWidget.c;
                return ((ap0) ca2Var2.getAccessor().c(936)).a(ca2Var2.getAccessor().d(931), true, new gvc(6));
            case 2:
                zv8[] zv8VarArr2 = PickerContactsListWidget.q;
                r1c r1cVar = new r1c(pickerContactsListWidget.getContext());
                r1cVar.setIcon(R.drawable.icon_search);
                r1cVar.setTitle(new tnh(R.string.empty_view_title_empty_search));
                r1cVar.setSubtitle(new tnh(R.string.empty_view_subtitle_empty_search));
                return r1cVar;
            default:
                zv8[] zv8VarArr3 = PickerContactsListWidget.q;
                RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext());
                recyclerView.setId(R.id.oneme_picker_members_list_view);
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipToOutline(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setHasFixedSize(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(pickerContactsListWidget.k);
                recyclerView.h(new tp3(new s57(recyclerView, 1), new cf7() { // from class: syc
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        qxc qxcVar;
                        int i4 = i3;
                        boolean z = false;
                        PickerContactsListWidget pickerContactsListWidget2 = pickerContactsListWidget;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i4) {
                            case 0:
                                int iL = pickerContactsListWidget2.j.l();
                                int iL2 = pickerContactsListWidget2.h.l() + iL;
                                CharSequence charSequence = (CharSequence) pickerContactsListWidget2.p1().l.a.getValue();
                                if ((charSequence != null && charSequence.length() != 0) || (iIntValue >= iL && iIntValue < iL2)) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            default:
                                int iL3 = pickerContactsListWidget2.j.l();
                                oxc oxcVar = pickerContactsListWidget2.h;
                                int iL4 = oxcVar.l() + iL3;
                                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.p1().l.a.getValue();
                                if (charSequence2 == null || charSequence2.length() == 0) {
                                    qxcVar = (iIntValue >= iL3 && iIntValue < iL4) ? (qxc) oxcVar.J(iIntValue - iL3) : null;
                                } else {
                                    qxcVar = (qxc) pickerContactsListWidget2.i.J(iIntValue);
                                }
                                return Boolean.valueOf(qxcVar != null ? ((m8b) pickerContactsListWidget2.p1().i.a.getValue()).d(qxcVar.a) : false);
                        }
                    }
                }, new pyb(20), new cf7() { // from class: syc
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        qxc qxcVar;
                        int i4 = i2;
                        boolean z = false;
                        PickerContactsListWidget pickerContactsListWidget2 = pickerContactsListWidget;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i4) {
                            case 0:
                                int iL = pickerContactsListWidget2.j.l();
                                int iL2 = pickerContactsListWidget2.h.l() + iL;
                                CharSequence charSequence = (CharSequence) pickerContactsListWidget2.p1().l.a.getValue();
                                if ((charSequence != null && charSequence.length() != 0) || (iIntValue >= iL && iIntValue < iL2)) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            default:
                                int iL3 = pickerContactsListWidget2.j.l();
                                oxc oxcVar = pickerContactsListWidget2.h;
                                int iL4 = oxcVar.l() + iL3;
                                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.p1().l.a.getValue();
                                if (charSequence2 == null || charSequence2.length() == 0) {
                                    qxcVar = (iIntValue >= iL3 && iIntValue < iL4) ? (qxc) oxcVar.J(iIntValue - iL3) : null;
                                } else {
                                    qxcVar = (qxc) pickerContactsListWidget2.i.J(iIntValue);
                                }
                                return Boolean.valueOf(qxcVar != null ? ((m8b) pickerContactsListWidget2.p1().i.a.getValue()).d(qxcVar.a) : false);
                        }
                    }
                }), -1);
                pickerContactsListWidget.o1(recyclerView);
                pickerContactsListWidget.n = tre.Y(recyclerView);
                return recyclerView;
        }
    }
}
