package defpackage;

import java.util.EnumSet;
import org.json.JSONArray;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class yy0 extends BaseConfigProvider implements itj {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy0(RemoteSettings remoteSettings, y3e y3eVar, String str, String str2, int i) {
        super(remoteSettings, y3eVar, str, str2);
        this.a = i;
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public final Object parseConfig(String str) {
        switch (this.a) {
            case 0:
                return new wy0(r5h.w1(str));
            default:
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    EnumSet enumSetNoneOf = EnumSet.noneOf(gtj.class);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String strOptString = jSONArray.optString(i);
                        Object obj = null;
                        if (strOptString != null) {
                            for (Object obj2 : gtj.g) {
                                if (((gtj) obj2).a.equals(strOptString)) {
                                    obj = obj2;
                                    obj = (gtj) obj;
                                }
                            }
                            obj = (gtj) obj;
                        }
                        if (obj != null) {
                            enumSetNoneOf.add(obj);
                        }
                    }
                    return new htj(enumSetNoneOf);
                } catch (Throwable th) {
                    getLog().logException("BitrateDumpGatheringConfigProviderImpl", "Can't parse configuration string ".concat(str), th);
                    return new htj(c76.a);
                }
        }
    }
}
