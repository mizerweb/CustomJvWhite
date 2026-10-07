package defpackage;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import one.me.android.MainActivity;
import one.me.main.MainScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainScreen b;

    public /* synthetic */ uk9(MainScreen mainScreen, int i) {
        this.a = i;
        this.b = mainScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        il9 il9Var;
        int i = this.a;
        MainScreen mainScreen = this.b;
        switch (i) {
            case 0:
                a8g a8gVar = MainScreen.u;
                Bundle args = mainScreen.getArgs();
                ca2 ca2Var = mainScreen.b;
                String string = args.getString("main:arg:deep_link");
                if (string == null) {
                    string = "";
                }
                return new kl9(((zed) ca2Var.getAccessor().c(101)).c, mainScreen.x1(), ca2Var.getAccessor().d(85), ca2Var.getAccessor().d(168), (tci) ca2Var.getAccessor().c(170), string, (voj) ca2Var.getAccessor().c(1044), ca2Var.getAccessor().d(174));
            case 1:
                ca2 ca2Var2 = mainScreen.b;
                return new tl5(ca2Var2.getAccessor().d(54), ca2Var2.getAccessor().d(85), ca2Var2.getAccessor().d(26), ca2Var2.getAccessor().d(180));
            case 2:
                a8g a8gVar2 = MainScreen.u;
                return new wk9(mainScreen);
            case 3:
                a8g a8gVar3 = MainScreen.u;
                ComponentCallbacks2 activity = mainScreen.getActivity();
                il9Var = activity instanceof il9 ? (il9) activity : null;
                if (il9Var != null) {
                    ((MainActivity) il9Var).A();
                }
                return Boolean.TRUE;
            default:
                ComponentCallbacks2 activity2 = mainScreen.getActivity();
                il9Var = activity2 instanceof il9 ? (il9) activity2 : null;
                if (il9Var != null) {
                    ((MainActivity) il9Var).A();
                }
                return Boolean.TRUE;
        }
    }
}
