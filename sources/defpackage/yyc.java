package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.chats.picker.members.PickerMembersListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yyc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerMembersListWidget b;

    public /* synthetic */ yyc(PickerMembersListWidget pickerMembersListWidget, int i) {
        this.a = i;
        this.b = pickerMembersListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        PickerMembersListWidget pickerMembersListWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PickerMembersListWidget.p;
                ifh ifhVar = new ifh(new yyc(pickerMembersListWidget, i2));
                ca2 ca2Var = pickerMembersListWidget.e;
                r00 r00Var = new r00((no4) ca2Var.getAccessor().d(132).getValue(), (xn3) ca2Var.getAccessor().d(144).getValue(), (a9a) ca2Var.getAccessor().c(983), (xhh) ((ifh) ca2Var.e()).getValue(), ca2Var.getAccessor().d(134), ca2Var.getAccessor().d(133), ifhVar);
                vv vvVar = pickerMembersListWidget.a;
                zv8[] zv8VarArr2 = PickerMembersListWidget.p;
                zv8 zv8Var = zv8VarArr2[0];
                long jLongValue = ((Number) vvVar.a(pickerMembersListWidget)).longValue();
                vv vvVar2 = pickerMembersListWidget.d;
                zv8 zv8Var2 = zv8VarArr2[3];
                return new czc(jLongValue, ((Boolean) vvVar2.a(pickerMembersListWidget)).booleanValue(), r00Var, r00Var, (gjf) ca2Var.getAccessor().d(97).getValue(), ca2Var.getAccessor().d(144));
            case 1:
                zv8[] zv8VarArr3 = PickerMembersListWidget.p;
                r1c r1cVar = new r1c(pickerMembersListWidget.getContext());
                r1cVar.setIcon(R.drawable.icon_search);
                r1cVar.setTitle(new tnh(R.string.empty_view_title_empty_search));
                r1cVar.setSubtitle(new tnh(R.string.empty_view_subtitle_empty_search));
                return r1cVar;
            case 2:
                zv8[] zv8VarArr4 = PickerMembersListWidget.p;
                k96 k96Var = new k96(pickerMembersListWidget.getContext());
                k96Var.setId(R.id.oneme_picker_members_list_view);
                k96Var.setClipChildren(false);
                k96Var.setClipToPadding(false);
                k96Var.setClipToOutline(false);
                k96Var.setHasFixedSize(true);
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager(1, false));
                k96Var.setAdapter(pickerMembersListWidget.i);
                k96Var.setItemAnimator(new bhb());
                int i3 = 6;
                k96Var.h(new tp3(new e6b(k96Var, 1), new iaa(k96Var, 27, pickerMembersListWidget), new w83(i3), new w83(i3)), -1);
                k96Var.j(new b65(k96Var));
                if (pickerMembersListWidget.p1()) {
                    pickerMembersListWidget.o1(k96Var);
                }
                pickerMembersListWidget.m = tre.Y(k96Var);
                return k96Var;
            default:
                ca2 ca2Var2 = pickerMembersListWidget.e;
                ifh ifhVarD = ca2Var2.getAccessor().d(480);
                ifh ifhVarD2 = ca2Var2.getAccessor().d(479);
                ifh ifhVarD3 = ca2Var2.getAccessor().d(377);
                ny8 ny8VarD = ca2Var2.d();
                vv vvVar3 = pickerMembersListWidget.c;
                zv8[] zv8VarArr5 = PickerMembersListWidget.p;
                zv8 zv8Var3 = zv8VarArr5[2];
                py2 py2Var = (py2) vvVar3.a(pickerMembersListWidget);
                vv vvVar4 = pickerMembersListWidget.a;
                zv8 zv8Var4 = zv8VarArr5[0];
                Long lValueOf = Long.valueOf(((Number) vvVar4.a(pickerMembersListWidget)).longValue());
                xn3 xn3Var = (xn3) ca2Var2.getAccessor().d(144).getValue();
                vv vvVar5 = pickerMembersListWidget.d;
                zv8 zv8Var5 = zv8VarArr5[3];
                return new qyc(ifhVarD, ifhVarD2, ifhVarD3, ny8VarD, py2Var, lValueOf, xn3Var, !((Boolean) vvVar5.a(pickerMembersListWidget)).booleanValue());
        }
    }
}
