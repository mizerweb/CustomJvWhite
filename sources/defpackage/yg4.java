package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import one.me.contactadddialog.ContactAddBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class yg4 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactAddBottomSheet b;

    public /* synthetic */ yg4(ContactAddBottomSheet contactAddBottomSheet, int i) {
        this.a = i;
        this.b = contactAddBottomSheet;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object value;
        dh4 dh4Var;
        Object value2;
        dh4 dh4Var2;
        int i4 = this.a;
        ContactAddBottomSheet contactAddBottomSheet = this.b;
        switch (i4) {
            case 0:
                zv8[] zv8VarArr = ContactAddBottomSheet.x;
                fh4 fh4VarE1 = contactAddBottomSheet.E1();
                String strValueOf = String.valueOf(charSequence);
                dh4 dh4Var3 = (dh4) fh4VarE1.j.a.getValue();
                if (dh4Var3 != null && !cqk.d(dh4Var3.c, strValueOf)) {
                    mjg mjgVar = fh4VarE1.i;
                    do {
                        value = mjgVar.getValue();
                        dh4Var = (dh4) value;
                    } while (!mjgVar.h(value, dh4Var != null ? dh4.a(dh4Var, strValueOf, null, null, null, 51) : null));
                }
                break;
            default:
                zv8[] zv8VarArr2 = ContactAddBottomSheet.x;
                fh4 fh4VarE2 = contactAddBottomSheet.E1();
                String strValueOf2 = String.valueOf(charSequence);
                dh4 dh4Var4 = (dh4) fh4VarE2.j.a.getValue();
                if (dh4Var4 != null && !cqk.d(dh4Var4.e, strValueOf2)) {
                    mjg mjgVar2 = fh4VarE2.i;
                    do {
                        value2 = mjgVar2.getValue();
                        dh4Var2 = (dh4) value2;
                    } while (!mjgVar2.h(value2, dh4Var2 != null ? dh4.a(dh4Var2, null, null, strValueOf2, null, 15) : null));
                }
                break;
        }
    }
}
