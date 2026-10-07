package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class e97 implements p7c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ e97(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ForwardPickerScreen.z;
                txc txcVarX1 = ((ForwardPickerScreen) widget).x1();
                String string = charSequence != null ? charSequence.toString() : null;
                mjg mjgVar = txcVarX1.k;
                if (string == null) {
                    string = "";
                }
                mjgVar.getClass();
                mjgVar.j(null, string);
                break;
            case 1:
                ldf ldfVar = SelectCountryBottomSheet.s;
                odf odfVar = (odf) ((SelectCountryBottomSheet) widget).n.getValue();
                String strValueOf = String.valueOf(charSequence);
                mjg mjgVar2 = odfVar.c;
                mjgVar2.getClass();
                mjgVar2.j(null, strValueOf);
                break;
            default:
                zv8[] zv8VarArr2 = StickersShowcaseScreen.m;
                zog zogVarP1 = ((StickersShowcaseScreen) widget).p1();
                hog hogVar = zogVarP1.d;
                boolean zA = hogVar.a();
                mjg mjgVar3 = hogVar.d;
                AtomicReference atomicReference = hogVar.g;
                if (!zA && (sggVar = zogVarP1.e.g) != null) {
                    sggVar.b(null);
                }
                zogVarP1.q = false;
                String strValueOf2 = String.valueOf(charSequence);
                mjg mjgVar4 = hogVar.f;
                if (!strValueOf2.equals(((fog) atomicReference.get()).b)) {
                    sgg sggVar2 = hogVar.h;
                    if (sggVar2 != null) {
                        sggVar2.b(null);
                    }
                    if (strValueOf2.length() != 0) {
                        gog gogVar = new gog(1, null);
                        mjgVar3.getClass();
                        mjgVar3.j(null, gogVar);
                        mjgVar4.getClass();
                        mjgVar4.j(null, strValueOf2);
                    } else {
                        vo8 vo8Var = (vo8) hogVar.i.m(hogVar, hog.j[0]);
                        if (vo8Var != null) {
                            vo8Var.b(null);
                        }
                        mjgVar3.setValue(hog.k);
                        atomicReference.set(new fog((String) null, 3));
                        mjgVar4.setValue(null);
                    }
                    break;
                }
                break;
        }
    }
}
