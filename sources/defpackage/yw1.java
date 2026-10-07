package defpackage;

import android.os.Bundle;
import java.util.Locale;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.ChatScreen;
import one.me.contactlist.ContactListWidget;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import one.me.sharedata.ShareDataPickerScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yw1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ yw1(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.af7
    public final Object invoke() {
        iyf iyfVar;
        mk8 mk8VarValueOf;
        v6i v6iVarValueOf;
        v7i v7iVarValueOf;
        mk8 mk8VarValueOf2;
        int i = this.a;
        mk8 mk8Var = mk8.b;
        Object objValueOf = null;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                l6m l6mVar = CallScreen.D1;
                String string = bundle.getString("call_start_source", null);
                if (string == null) {
                    return null;
                }
                for (Object obj : c32.d) {
                    if (((c32) obj).a.equals(string)) {
                        objValueOf = obj;
                        return (c32) objValueOf;
                    }
                }
                return (c32) objValueOf;
            case 1:
                ou7 ou7Var = ChatScreen.L1;
                return new oqa(bundle.getBoolean("is_preview"));
            case 2:
                zv8[] zv8VarArr = ContactListWidget.o1;
                String string2 = bundle.getString("contact_screen_open_mode");
                if (string2 == null) {
                    string2 = "";
                }
                try {
                    objValueOf = cl4.valueOf(string2);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (objValueOf == null) {
                    objValueOf = cl4.c;
                }
                return Boolean.valueOf(objValueOf == cl4.a);
            case 3:
                zv8[] zv8VarArr2 = ShareDataPickerScreen.C;
                String string3 = bundle.getString("oneme:share:mode");
                for (Object obj2 : iyf.d) {
                    if (((iyf) obj2).a.equals(string3)) {
                        objValueOf = obj2;
                        iyfVar = (iyf) objValueOf;
                        if (iyfVar == null) {
                            return iyf.DEFAULT;
                        }
                        return iyfVar;
                    }
                }
                iyfVar = (iyf) objValueOf;
                if (iyfVar == null) {
                    return iyf.DEFAULT;
                }
                return iyfVar;
            case 4:
                zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                String string4 = bundle.getString("twofa_check_password_source_key");
                return (string4 == null || (mk8VarValueOf = mk8.valueOf(string4.toUpperCase(Locale.ROOT))) == null) ? mk8Var : mk8VarValueOf;
            case 5:
                zv8[] zv8VarArr4 = TwoFACreationScreen.n;
                String string5 = bundle.getString("creation_2fa_step_key");
                return (string5 == null || (v6iVarValueOf = v6i.valueOf(string5.toUpperCase(Locale.ROOT))) == null) ? v6i.a : v6iVarValueOf;
            case 6:
                zv8[] zv8VarArr5 = TwoFACreationScreen.n;
                String string6 = bundle.getString("creation_2fa_type_key");
                w6i w6iVarValueOf = string6 != null ? w6i.valueOf(string6.toUpperCase(Locale.ROOT)) : null;
                if (w6iVarValueOf != null) {
                    return w6iVarValueOf;
                }
                ore.p("Can't open creation twoFA because type");
                return null;
            case 7:
                zv8[] zv8VarArr6 = TwoFACreationScreen.n;
                String string7 = bundle.getString("creation_2fa_source_key");
                mk8 mk8VarValueOf3 = string7 != null ? mk8.valueOf(string7.toUpperCase(Locale.ROOT)) : null;
                if (mk8VarValueOf3 != null) {
                    return mk8VarValueOf3;
                }
                ore.p("Can't open creation twoFA because source");
                return null;
            case 8:
                zv8[] zv8VarArr7 = TwoFAOnboardingScreen.g;
                String string8 = bundle.getString("onboarding_2fa_state_key");
                return (string8 == null || (v7iVarValueOf = v7i.valueOf(string8.toUpperCase(Locale.ROOT))) == null) ? v7i.b : v7iVarValueOf;
            default:
                zv8[] zv8VarArr8 = TwoFAStartRestoreScreen.j;
                String string9 = bundle.getString("twofa_check_password_source_key");
                return (string9 == null || (mk8VarValueOf2 = mk8.valueOf(string9.toUpperCase(Locale.ROOT))) == null) ? mk8Var : mk8VarValueOf2;
        }
    }
}
