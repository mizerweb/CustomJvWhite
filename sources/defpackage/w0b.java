package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface w0b {

    public static class a {
        public static final a c = new a(EnumC0006a.OK, null);
        private final EnumC0006a a;
        private final String b;

        /* JADX INFO: renamed from: w0b$a$a, reason: collision with other inner class name */
        public enum EnumC0006a {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        public a(EnumC0006a enumC0006a, String str) {
            this.a = enumC0006a;
            this.b = str;
        }

        public EnumC0006a a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public boolean c() {
            return this.a == EnumC0006a.OK;
        }
    }

    a a(File file, fie fieVar);
}
