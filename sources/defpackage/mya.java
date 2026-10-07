package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mya extends zxa {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mya(int i) {
        super(72, 73);
        this.c = i;
        switch (i) {
            case 1:
                super(24, 25);
                this.d = new bya();
                break;
            case 2:
                super(57, 58);
                this.d = new bya();
                break;
            default:
                this.d = mya.class.getName();
                break;
        }
    }

    @Override // defpackage.zxa
    public void a(id7 id7Var) {
        switch (this.c) {
            case 0:
                String str = (String) this.d;
                gm0.x(str, "start migration 72 to 73", null);
                id7Var.I("UPDATE story_draft_text_layers SET scale = scale * slider_scale");
                id7Var.I("\n            CREATE TABLE IF NOT EXISTS `story_draft_text_layers_new` (\n                `layer_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n                `draft_id` INTEGER NOT NULL,\n                `align_mode` TEXT NOT NULL,\n                `text_color` INTEGER NOT NULL,\n                `text_background_color` INTEGER NOT NULL,\n                `text` TEXT NOT NULL,\n                `text_style` TEXT NOT NULL,\n                `layout_width` INTEGER NOT NULL,\n                `translation_x` REAL NOT NULL,\n                `translation_y` REAL NOT NULL,\n                `scale` REAL NOT NULL,\n                `rotation` REAL NOT NULL,\n                `text_bounds_left` REAL,\n                `text_bounds_top` REAL,\n                `text_bounds_right` REAL,\n                `text_bounds_bottom` REAL,\n                FOREIGN KEY(`draft_id`) REFERENCES `story_drafts`(`draft_id`)\n                    ON UPDATE NO ACTION ON DELETE CASCADE\n            )\n            ");
                id7Var.I("\n            INSERT INTO story_draft_text_layers_new (\n                layer_id, draft_id, align_mode, text_color, text_background_color, text, text_style,\n                layout_width, translation_x, translation_y, scale, rotation,\n                text_bounds_left, text_bounds_top, text_bounds_right, text_bounds_bottom\n            )\n            SELECT\n                layer_id, draft_id, align_mode, text_color, text_background_color, text, text_style,\n                layout_width, translation_x, translation_y, scale, rotation,\n                text_bounds_left, text_bounds_top, text_bounds_right, text_bounds_bottom\n            FROM story_draft_text_layers\n            ");
                id7Var.I("DROP TABLE story_draft_text_layers");
                id7Var.I("ALTER TABLE story_draft_text_layers_new RENAME TO story_draft_text_layers");
                id7Var.I("CREATE INDEX IF NOT EXISTS `index_story_draft_text_layers_draft_id` ON `story_draft_text_layers` (`draft_id`)");
                gm0.x(str, "finish migration 72 to 73", null);
                break;
            default:
                super.a(id7Var);
                break;
        }
    }

    @Override // defpackage.zxa
    public void b(qxe qxeVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 1:
                n1g.u(qxeVar, "CREATE TABLE IF NOT EXISTS `_new_contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence_seen` INTEGER NOT NULL, `presence_status` INTEGER NOT NULL DEFAULT 0, `data` BLOB NOT NULL)");
                n1g.u(qxeVar, "INSERT INTO `_new_contacts` (`id`,`server_id`,`presence_seen`,`data`) SELECT `id`,`server_id`,`presence`,`data` FROM `contacts`");
                n1g.u(qxeVar, "DROP TABLE `contacts`");
                n1g.u(qxeVar, "ALTER TABLE `_new_contacts` RENAME TO `contacts`");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)");
                n1g.u(qxeVar, "CREATE INDEX IF NOT EXISTS `index_contacts_presence_seen` ON `contacts` (`presence_seen`)");
                ((bya) obj).f(qxeVar);
                break;
            case 2:
                n1g.u(qxeVar, "DROP TABLE `presence`");
                ((bya) obj).f(qxeVar);
                break;
            default:
                super.b(qxeVar);
                break;
        }
    }
}
