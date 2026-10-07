package one.me.mods;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import ru.ok.android.commons.app.ApplicationProvider;

/* JADX INFO: compiled from: Mods.smali */
/* JADX INFO: loaded from: classes.dex */
public final class Mods {
    static SharedPreferences a() {
        return ApplicationProvider.a.getSharedPreferences("mods", 0);
    }

    public static boolean get(String str) {
        return a().getBoolean(str, false);
    }

    public static void set(String str, boolean z) {
        a().edit().putBoolean(str, z).apply();
    }

    public static void showDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Моды");
        builder.setMultiChoiceItems(new CharSequence[]{"Нечиталка", "Офлайн"}, new boolean[]{get("noread"), get("offline")}, new ModsToggleListener());
        builder.setPositiveButton("Готово", (DialogInterface.OnClickListener) null);
        builder.show();
    }
}
