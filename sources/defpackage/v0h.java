package defpackage;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class v0h {
    public static final int a(int i) {
        return qt4.D(i);
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 300;
        }
        if (i == 2) {
            return 600;
        }
        if (i == 3) {
            return 900;
        }
        throw null;
    }

    public static int c(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static String d(String str, String str2, List list) {
        return str + list + str2;
    }

    public static /* synthetic */ List e(c77 c77Var) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{c77Var}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ List f(c77 c77Var, c77 c77Var2) {
        Object[] objArr = {c77Var, c77Var2};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ void g(mdi mdiVar) {
        throw null;
    }

    public static /* synthetic */ void h(wqi wqiVar) {
        throw null;
    }

    public static void i(TextView textView, tnh tnhVar) {
        textView.setText(tnhVar.b(textView.getContext()));
    }

    public static /* synthetic */ void j(AtomicReference atomicReference, o3h o3hVar, q3h q3hVar) {
        while (!atomicReference.compareAndSet(o3hVar, q3hVar) && atomicReference.get() == o3hVar) {
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "LEFT";
        }
        if (i == 2) {
            return "CENTER";
        }
        if (i == 3) {
            return "RIGHT";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "THIN";
        }
        if (i == 2) {
            return "SEMIBOLD";
        }
        if (i == 3) {
            return "BOLD";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "PREPARING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FAILED";
        }
        return "UPLOADING";
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "WAITING_FOR_UPLOAD_STATUS";
            case 3:
                return "SENDING_UPLOAD_REQUEST";
            case 4:
                return "SENDING_DATA";
            case 5:
                return "WAITING_FOR_CHUNK_STATUS";
            case 6:
                return "SHUTDOWN";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "PHOTO";
            case 2:
                return "AUDIO";
            case 3:
                return "VIDEO";
            case 4:
                return "VIDEO_MESSAGE";
            case 5:
                return "FILE";
            case 6:
                return "STICKER";
            case 7:
                return "STORY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "UNSPECIFIED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "ONE_ME";
        }
        return "ONE_VIDEO";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "MORE";
        }
        if (i == 2) {
            return "ROTATION";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NONE";
        }
        return "PIN";
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "VIDEO";
        }
        if (i == 2) {
            return "VIDEO_MSG";
        }
        if (i != 3) {
            return i != 4 ? "null" : "FILE";
        }
        return "GIF";
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "CONTACT";
        }
        if (i == 2) {
            return "BOT_TAG";
        }
        if (i != 3) {
            return i != 4 ? "null" : "BOT_COMMAND_DESCRIPTION";
        }
        return "BOT_COMMAND";
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "THIN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "BOLD";
        }
        return "SEMIBOLD";
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "TEXT";
            case 2:
                return "AUDIO";
            case 3:
                return "VIDEO_MSG";
            case 4:
                return "STICKER";
            case 5:
                return "FILE";
            case 6:
                return "PHOTO";
            case 7:
                return "VIDEO";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("LEFT")) {
            return 1;
        }
        if (str.equals("CENTER")) {
            return 2;
        }
        if (str.equals("RIGHT")) {
            return 3;
        }
        ore.p("No enum constant one.me.stories.database.model.TextLayerModel.AlignMode.".concat(str));
        return 0;
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("THIN")) {
            return 1;
        }
        if (str.equals("SEMIBOLD")) {
            return 2;
        }
        if (str.equals("BOLD")) {
            return 3;
        }
        ore.p("No enum constant one.me.stories.database.model.TextLayerModel.TextStyle.".concat(str));
        return 0;
    }
}
