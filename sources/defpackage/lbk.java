package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lbk implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ lbk(jek jekVar) {
        this.a = 16;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Instant instant;
        switch (this.a) {
            case 0:
                return ((o8k) obj).toString();
            case 1:
                return ((o8k) obj).toString();
            case 2:
                return ((o8k) obj).toString();
            case 3:
                return ((e8k) obj).toString();
            case 4:
                return ((o8k) obj).toString();
            case 5:
                return ((zbk) obj).a;
            case 6:
                return ((zbk) obj).b;
            case 7:
                return ((ybk) obj).i;
            case 8:
                fak fakVar = (fak) obj;
                synchronized (fakVar.e) {
                    instant = fakVar.f;
                    break;
                }
                return instant;
            case 9:
                return ((rck) obj).a;
            case 10:
                return ((rck) obj).a;
            case 11:
                return new ArrayList();
            case 12:
                try {
                    return new tdk((InputStream) obj);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            case 13:
                Optional optional = (Optional) obj;
                return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
            case 14:
                return (String) ((Map.Entry) obj).getKey();
            case 15:
                return (List) ((Map.Entry) obj).getValue();
            case 16:
                Object[] objArr = {(String) ((Map.Entry) obj).getValue()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return Collections.unmodifiableList(arrayList);
            case 17:
                return (String) ((List) obj).get(1);
            case 18:
                return ((String) obj).trim();
            default:
                return ((String) obj).replace("CN=", "");
        }
    }

    public /* synthetic */ lbk(int i) {
        this.a = i;
    }
}
