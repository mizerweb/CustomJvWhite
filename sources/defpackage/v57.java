package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class v57 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ FoldersPickerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v57(lq4 lq4Var, FoldersPickerScreen foldersPickerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = foldersPickerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        FoldersPickerScreen foldersPickerScreen = this.g;
        switch (i) {
            case 0:
                v57 v57Var = new v57(lq4Var, foldersPickerScreen, 0);
                v57Var.f = obj;
                return v57Var;
            case 1:
                v57 v57Var2 = new v57(lq4Var, foldersPickerScreen, 1);
                v57Var2.f = obj;
                return v57Var2;
            case 2:
                v57 v57Var3 = new v57(lq4Var, foldersPickerScreen, 2);
                v57Var3.f = obj;
                return v57Var3;
            default:
                v57 v57Var4 = new v57(lq4Var, foldersPickerScreen, 3);
                v57Var4.f = obj;
                return v57Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((v57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((v57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((v57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((v57) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        FoldersPickerScreen foldersPickerScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                if (list != null) {
                    zv8[] zv8VarArr = FoldersPickerScreen.l;
                    if (list.isEmpty()) {
                        View view = foldersPickerScreen.getView();
                        wf4 wf4Var = view instanceof wf4 ? (wf4) view : null;
                        if (wf4Var != null) {
                            View view2 = (View) foldersPickerScreen.k.getValue();
                            uf4 uf4Var = new uf4(0, 0);
                            uf4Var.j = ((rcc) foldersPickerScreen.i.m(foldersPickerScreen, FoldersPickerScreen.l[3])).getId();
                            uf4Var.e = 0;
                            uf4Var.h = 0;
                            uf4Var.l = 0;
                            yab.d(wf4Var, view2, uf4Var);
                        }
                        j8e j8eVar = foldersPickerScreen.h;
                        zv8[] zv8VarArr2 = FoldersPickerScreen.l;
                        ((RecyclerView) j8eVar.m(foldersPickerScreen, zv8VarArr2[2])).setVisibility(8);
                        ((cyb) foldersPickerScreen.j.m(foldersPickerScreen, zv8VarArr2[4])).setVisibility(8);
                    } else {
                        foldersPickerScreen.g.I(list, new k36(11, foldersPickerScreen));
                    }
                } else {
                    foldersPickerScreen.g.I(list, new k36(11, foldersPickerScreen));
                }
                return sbiVar;
            case 1:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = FoldersPickerScreen.l;
                ((RecyclerView) foldersPickerScreen.h.m(foldersPickerScreen, FoldersPickerScreen.l[2])).invalidate();
                return sbiVar;
            case 2:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr4 = FoldersPickerScreen.l;
                ((cyb) foldersPickerScreen.j.m(foldersPickerScreen, FoldersPickerScreen.l[4])).setEnabled(zBooleanValue);
                return sbiVar;
            default:
                ch3.d0(obj);
                z57 z57Var = (z57) obj2;
                if (cqk.d(z57Var, y57.a)) {
                    zv8[] zv8VarArr5 = FoldersPickerScreen.l;
                    foldersPickerScreen.p1(v37.a);
                } else {
                    if (!cqk.d(z57Var, x57.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr6 = FoldersPickerScreen.l;
                    foldersPickerScreen.p1(u37.a);
                }
                foldersPickerScreen.getRouter().D();
                return sbiVar;
        }
    }
}
