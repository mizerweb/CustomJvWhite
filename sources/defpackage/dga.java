package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class dga {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElement[] messageElementArr) {
        bga bgaVar;
        bga bgaVar2;
        ArrayList arrayList = new ArrayList();
        for (Protos.MessageElement messageElement : messageElementArr) {
            int i = messageElement.type;
            HashMap map = null;
            switch (i) {
                case 0:
                    bgaVar = bga.a;
                    bgaVar2 = bgaVar;
                    break;
                case 1:
                    bgaVar = bga.b;
                    bgaVar2 = bgaVar;
                    break;
                case 2:
                    bgaVar = bga.d;
                    bgaVar2 = bgaVar;
                    break;
                case 3:
                    bgaVar = bga.c;
                    bgaVar2 = bgaVar;
                    break;
                case 4:
                    bgaVar = bga.e;
                    bgaVar2 = bgaVar;
                    break;
                case 5:
                    bgaVar = bga.f;
                    bgaVar2 = bgaVar;
                    break;
                case 6:
                    bgaVar = bga.g;
                    bgaVar2 = bgaVar;
                    break;
                case 7:
                    bgaVar = bga.i;
                    bgaVar2 = bgaVar;
                    break;
                case 8:
                    bgaVar = bga.j;
                    bgaVar2 = bgaVar;
                    break;
                case 9:
                    bgaVar = bga.h;
                    bgaVar2 = bgaVar;
                    break;
                case 10:
                    bgaVar = bga.k;
                    bgaVar2 = bgaVar;
                    break;
                case 11:
                    bgaVar = bga.l;
                    bgaVar2 = bgaVar;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    gm0.q("dga", "Unknown protoElement type = " + i);
                    bgaVar2 = null;
                    break;
            }
            long j = messageElement.entityId;
            String str = ch3.r(messageElement.entityName) ? null : messageElement.entityName;
            int i2 = messageElement.from;
            int i3 = messageElement.length;
            if (messageElement.linkAttributes != null) {
                map = new HashMap(2);
                map.put(MLFeatureConfigProviderBase.URL_KEY, messageElement.linkAttributes.url);
                Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
                if (linkAttributes.hasResultMask) {
                    map.put("checkResult", Long.valueOf(linkAttributes.checkResultMask));
                }
            }
            arrayList.add(new cga(j, str, bgaVar2, i2, i3, map));
        }
        return arrayList;
    }

    public static byte[] b(List list) {
        return sia.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            cga cgaVar = (cga) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            long j = cgaVar.a;
            Map map = cgaVar.f;
            messageElement.entityId = j;
            String str = cgaVar.b;
            byte[] bArr = a.a;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = cgaVar.d;
            messageElement.length = cgaVar.e;
            switch (cgaVar.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    if (!map.containsKey(MLFeatureConfigProviderBase.URL_KEY)) {
                        ore.k("There are not enough attributes for the type = LINK");
                        return null;
                    }
                    Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                    messageElement.linkAttributes = linkAttributes;
                    linkAttributes.url = (String) map.get(MLFeatureConfigProviderBase.URL_KEY);
                    Object obj = map.get("checkResult");
                    if (obj != null) {
                        Protos.MessageElement.LinkAttributes linkAttributes2 = messageElement.linkAttributes;
                        linkAttributes2.hasResultMask = true;
                        linkAttributes2.checkResultMask = ((Long) obj).longValue();
                    }
                    break;
                    break;
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
                case 11:
                    messageElement.type = 11;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
