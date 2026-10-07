package defpackage;

import one.me.login.inputname.InputNameScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zg8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ zg8(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        zxb zxbVar = zxb.PRIMARY;
        sbi sbiVar = sbi.a;
        InputNameScreen inputNameScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = InputNameScreen.r;
                inputNameScreen.t1();
                break;
            case 1:
                cyb cybVar = (cyb) obj;
                zv8[] zv8VarArr2 = InputNameScreen.r;
                cybVar.setText(np4.q(inputNameScreen.getContext(), R.string.oneme_login_input_name_continue_button_disabled));
                cybVar.setAppearance(zxbVar);
                cybVar.setSize(ayb.g);
                cybVar.setEnabled(false);
                break;
            case 2:
                cyb cybVar2 = (cyb) obj;
                zv8[] zv8VarArr3 = InputNameScreen.r;
                cybVar2.setId(R.id.oneme_login_input_name_continue_btn);
                cybVar2.setText(np4.q(inputNameScreen.getContext(), R.string.oneme_login_input_name_continue_button_active));
                cybVar2.setAppearance(zxbVar);
                cybVar2.setSize(ayb.g);
                cybVar2.setEnabled(true);
                break;
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                zv8[] zv8VarArr4 = InputNameScreen.r;
                boolean z = charSequence.length() > 0;
                String string = charSequence.toString();
                vv vvVar = inputNameScreen.p;
                zv8 zv8Var = InputNameScreen.r[5];
                vvVar.b(inputNameScreen, string);
                oj ojVarO1 = inputNameScreen.o1();
                ojVarO1.c = true;
                ojVarO1.setEnabled(z);
                a8j.x(inputNameScreen.s1().i, new ev7(1));
                break;
            case 4:
                CharSequence charSequence2 = (CharSequence) obj;
                zv8[] zv8VarArr5 = InputNameScreen.r;
                a8j.x(inputNameScreen.s1().i, new ev7(2));
                String string2 = charSequence2.toString();
                vv vvVar2 = inputNameScreen.q;
                zv8 zv8Var2 = InputNameScreen.r[6];
                vvVar2.b(inputNameScreen, string2);
                inputNameScreen.s1().B(charSequence2.toString(), inputNameScreen.q1().b.isFocused());
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zv8[] zv8VarArr6 = InputNameScreen.r;
                if (!inputNameScreen.q1().l()) {
                    inputNameScreen.s1().B(inputNameScreen.r1(), zBooleanValue);
                }
                break;
        }
        return sbiVar;
    }
}
