package ru.ok.android.onelog;

import defpackage.mv8;
import defpackage.u21;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
class StreamingOneLogItemsApiValue extends u21 {
    private final File file;
    private final OneLogTrigger trigger;

    public StreamingOneLogItemsApiValue(File file, OneLogTrigger oneLogTrigger) {
        this.file = file;
        this.trigger = oneLogTrigger;
    }

    @Override // defpackage.u21
    public void write(mv8 mv8Var) throws JsonSerializeException, IOException {
        mv8Var.r();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.file), StandardCharsets.UTF_8);
            try {
                mv8Var.T(inputStreamReader);
                inputStreamReader.close();
                OneLogTrigger oneLogTrigger = this.trigger;
                if (oneLogTrigger != null) {
                    OneLogItemSerializer.INSTANCE.serialize(mv8Var, oneLogTrigger.toItem());
                }
                mv8Var.q();
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (JsonSyntaxException e) {
            throw new OneLogCorruptedFileException(this.file, e);
        }
    }
}
