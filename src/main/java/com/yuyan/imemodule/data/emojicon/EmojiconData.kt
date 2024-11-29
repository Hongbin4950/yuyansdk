package com.yuyan.imemodule.data.emojicon

import com.yuyan.imemodule.R

/**
 * Emoji表情实体类
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */

object EmojiconData{

    class Category(val label: String = "", val icon: Int = 0)

    val symbolData: Map<Category, List<String>> = linkedMapOf(
        Category("中文" , R.drawable.icon_symbol_chinese) to listOf("，", "。", "！", "＠", "＃", "＄", "％", "＾", "＆", "＊", "（", "）", "“", "”", "‘", "’", "＝", "＿", "｀", "：", "；", "？", "〜", "｜", "＋", "―", "＼", "／", "、", "．", "……", "＜", "＞", "ー", "−", "・", "￥", "〒", "々", "仝", "〃", "ゝ", "ゞ", "ヽ", "ヾ", "１", "２", "３", "４", "５", "６", "７", "８", "９", "０",),
        Category("英文" , R.drawable.icon_symbol_english) to listOf(",", ".",  "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "'", "\"", "=", "_", "`", ":", ";", "?", "~", "|", "+", "-", "\\", "/", "[", "]", "{", "}", "<", ">", "“", "”", "·", "‘", "’", "¡", "¿", "¥", "€", "£", "¢", "©", "®", "™", "℃", "℉", "°", "§", "№", "†", "‡", "‥", "…", "‰", "※", "‾", "⁄", "‼", "⁇", "⁈", "⁉", "√", "π", "±", "×", "÷", "¶", "∆", "¤", "µ", "‹", "›", "«", "»", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",),
        Category("数学" , R.drawable.icon_symbol_math) to listOf("+", "-", "×", "÷", "±", "∓", "=", "≠", "∼", "≅", "<", ">", "≤", "≥", "√", "∛", "≈", "≡", "⁺", "⁻", "⊕", "⊗", "%", "‰", "∀", "∂", "∃", "∅", "∆", "∇", "∈", "∉", "∋", "∌", "∏", "∑", "ℵ", "∝", "∞", "∟", "∠", "∧", "∨", "∣", "∥", "∩", "∪", "∫", "∬", "∮", "∴", "∵", "∶", "∷", "⊂", "⊃", "⊄", "⊅", "⊆", "⊇", "∪", "∩", "ⁿ",),
        Category("括号" , R.drawable.icon_symbol_parentheses) to listOf("(", ")", "[", "]", "{", "}", "（", "）", "［", "］", "｛", "｝", "❨", "❩", "❲", "❳", "❴", "❵", "‘", "’", "“", "”", "❛", "❜", "❝", "❞", "<", ">", "〈", "〉", "《", "》", "〔", "〕", "【", "】", "〘", "〙", "「", "」", "『", "』", "︵", "︶", "︷", "︸", "︹", "︺", "︻", "︼", "︽", "︾", "︿", "﹀", "﹁", "﹂",),
        Category("序号" , R.drawable.icon_symbol_sequence_2) to listOf("①", "②", "③", "④", "⑤", "⑥", "⑦", "⑧", "⑨", "⑩", "⑴", "⑵", "⑶", "⑷", "⑸", "⑹", "⑺", "⑻", "⑼", "⑽", "❶", "❷", "❸", "❹", "❺", "❻", "❼", "❽", "❾", "❿", "㈠", "㈡", "㈢", "㈣", "㈤", "㈥", "㈦", "㈧", "㈨", "㈩", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ", "Ⅹ", "Ⅺ", "Ⅻ", "Ⅼ", "Ⅽ", "Ⅾ", "Ⅿ", "ⅰ", "ⅱ", "ⅲ", "ⅳ", "ⅴ", "ⅵ", "ⅶ", "ⅷ", "ⅸ", "ⅹ", "ⅺ", "ⅻ", "ⅼ", "ⅽ", "ⅾ", "ⅿ", "¹", "²", "³", "⁴", "₁", "₂", "₃", "₄", "½", "⅓", "⅔", "㊣"),
        Category("箭头" , R.drawable.icon_symbol_special_2) to listOf("←", "↑", "→", "↓", "↔", "↕", "↖", "↗", "↘", "↙", "↚", "↛", "↜", "↝", "↞", "↟", "↠", "↡", "↢", "↣", "↤", "↥", "↦", "↧", "↨", "↩", "↪", "↫", "↬", "↭", "↮", "↯", "↰", "↱", "↲", "↳", "↴", "↵", "↶", "↷", "↸", "↹", "↺", "↻", "↼", "↽", "↾", "↿", "⇀", "⇁", "⇂", "⇃", "⇄", "⇅", "⇆", "⇇", "⇈", "⇉", "⇊", "⇋", "⇌", "⇍", "⇎", "⇏", "⇐", "⇑", "⇒", "⇓", "⇔", "⇕", "⇖", "⇗", "⇘", "⇙", "⇚", "⇛", "⇜", "⇝", "⇞", "⇟", "⇠", "⇡", "⇢", "⇣"),
        Category("形状" , R.drawable.icon_symbol_special_1) to listOf("⚫", "⚪", "●", "○", "■", "□", "⬛", "⬜", "★", "☆", "◆", "◇", "▲", "△", "▶", "▷", "▼", "▽", "◀", "◁", "◐", "◑", "♀", "♂", "♤", "♡", "♧", "♢", "♠", "♥", "♣", "♦", "•", "❖", "✓", "✔", "✕", "✖", "✗", "✘", "✙", "✚", "✛", "✜", "✝", "✞", "✟", "✠", "✡", "✢", "✣", "✤", "✥", "✦", "✧", "✨", "✩", "✪", "✫", "✬", "✭", "✮", "✯", "✰", "✱", "✲", "✳", "✴", "✵", "✶", "✷", "✸", "✹", "✺", "✻", "✼", "✽", "✾", "✿", "❀", "❁", "❂", "❃", "❄", "❅", "❆", "❇", "❈", "❉", "❊", "❋", "❌", "❍", "❎", "❏", "❐", "❑", "❒", "◈", "◉", "◊", "○", "◢", "◣", "◤", "◥", "❢", "❣", "❤", "❥", "❦", "❧"),
        Category("希腊" , R.drawable.icon_symbol_greek) to listOf("α", "β", "γ", "δ", "ε", "ζ", "η", "θ", "ι", "κ", "λ", "μ", "ν", "ξ", "ο", "π", "ρ", "ς", "σ", "τ", "υ", "φ", "χ", "ψ", "ω", "Α", "Β", "Γ", "Δ", "Ε", "Ζ", "Η", "Θ", "Ι", "Κ", "Λ", "Μ", "Ν", "Ξ", "Ο", "Π", "Ρ", "Σ", "Τ", "Υ", "Φ", "Χ", "Ψ", "Ω",),
        Category("拼音" , R.drawable.icon_symbol_pinyin) to listOf("ā", "á", "ǎ", "à", "ō", "ó", "ǒ", "ò", "ê", "ē", "é", "ě", "è", "ī", "í", "ǐ", "ì", "ū", "ú", "ǔ", "ù", "ǖ", "ǘ", "ǚ", "ǜ", "ü"),
        Category("注音" , R.drawable.icon_symbol_phonetic) to listOf("ㄅ", "ㄆ", "ㄇ", "ㄈ", "ㄉ", "ㄊ", "ㄋ", "ㄌ", "ㄍ", "ㄎ", "ㄏ", "ㄐ", "ㄑ", "ㄒ", "ㄓ", "ㄔ", "ㄕ", "ㄖ", "ㄗ", "ㄘ", "ㄙ", "ㄚ", "ㄛ", "ㄜ", "ㄝ", "ㄞ", "ㄟ", "ㄠ", "ㄡ", "ㄢ", "ㄣ", "ㄤ", "ㄥ", "ㄦ", "ㄧ", "ㄨ", "ㄩ", "ㄪ", "ㄫ", "ㆠ", "ㆡ", "ㆢ", "ㆣ", "ㆤ", "ㆥ", "ㆦ", "ㆧ", "ㆨ", "ㆩ", "ㆪ", "ㆫ", "ㆬ", "ㆭ", "ㆮ", "ㆯ", "ㆰ", "ㆱ", "ㆲ", "ㆳ", "ㆴ", "ㆵ", "ㆶ", "ㆷ",),
        Category("平假" , R.drawable.icon_symbol_japanese_hiragana) to listOf( "ぁ", "あ", "ぃ", "い", "ぅ", "う", "ぇ", "え", "ぉ", "お", "か", "が", "き", "ぎ", "く", "ぐ", "け", "げ", "こ", "ご", "さ", "ざ", "し", "じ", "す", "ず", "せ", "ぜ", "そ", "ぞ", "た", "だ", "ち", "ぢ", "っ", "つ", "づ", "て", "で", "と", "ど", "な", "に", "ぬ", "ね", "の", "は", "ば", "ぱ", "ひ", "び", "ぴ", "ふ", "ぶ", "ぷ", "へ", "べ", "ぺ", "ほ", "ぼ", "ぽ", "ま", "み", "む", "め", "も", "ゃ", "や", "ゅ", "ゆ", "ょ", "よ", "ら", "り", "る", "れ", "ろ", "ゎ", "わ", "ゐ", "ゑ", "を", "ん", "ゔ", "ゕ", "ゖ", "゙", "゚", "゛", "゜", "ゝ", "ゞ", "ゟ",),
        Category("片假" , R.drawable.icon_symbol_japanese_katakana) to listOf("゠", "ァ", "ア", "ィ", "イ", "ゥ", "ウ", "ェ", "エ", "ォ", "オ", "カ", "ガ", "キ", "ギ", "ク", "グ", "ケ", "ゲ", "コ", "ゴ", "サ", "ザ", "シ", "ジ", "ス", "ズ", "セ", "ゼ", "ソ", "ゾ", "タ", "ダ", "チ", "ヂ", "ッ", "ツ", "ヅ", "テ", "デ", "ト", "ド", "ナ", "ニ", "ヌ", "ネ", "ノ", "ハ", "バ", "パ", "ヒ", "ビ", "ピ", "フ", "ブ", "プ", "ヘ", "ベ", "ペ", "ホ", "ボ", "ポ", "マ", "ミ", "ム", "メ", "モ", "ャ", "ヤ", "ュ", "ユ", "ョ", "ヨ", "ラ", "リ", "ル", "レ", "ロ", "ヮ", "ワ", "ヰ", "ヱ", "ヲ", "ン", "ヴ", "ヵ", "ヶ", "ヷ", "ヸ", "ヹ", "ヺ", "・", "ー", "ヽ", "ヾ", "ヿ", "ㇰ", "ㇱ", "ㇲ", "ㇳ", "ㇴ", "ㇵ", "ㇶ", "ㇷ", "ㇸ", "ㇹ", "ㇺ", "ㇻ", "ㇼ", "ㇽ", "ㇾ", "ㇿ",),
        Category("俄语" , R.drawable.icon_symbol_russian) to listOf( "а", "о", "у", "ы", "э", "я", "ё", "ю", "и", "е", "б", "в", "г", "д", "ж", "з", "л", "м", "н", "р", "й", "п", "ф", "к", "т", "ш", "с", "х", "ц", "ч", "щ", "ъ", "ь", "А", "О", "У", "Ы", "Э", "Я", "Ё", "Ю", "П", "Е", "Б", "В", "Г", "Д", "Ж", "З", "Л", "М", "Н", "Р", "Й", "И", "Ф", "К", "Т", "Ш", "С", "Х", "Ц", "Ч", "Щ", "Ъ", "Ь",),
        Category("特殊" , R.drawable.icon_symbol_sequence_1) to listOf("囍", "卍", "卐", "㍿", "㊎", "㊍", "㊌", "㊋", "㊏", "㊚", "㊛", "㊐", "㊊", "㊣", "㊤", "㊥", "㊦", "㊧", "㊨", "㊒", "㊫", "㊑", "㊓", "㊔", "㊕", "㊖", "㊗", "㊘", "㊜", "㊝", "㊞", "㊟", "㊠", "㊡", "㊢", "㊩", "㊪", "㊬", "㊭", "㊮", "㊯", "㊰", "㊀", "㊁", "㊂", "㊃", "㊄", "㊅", "㊆", "㊇", "㊈", "㊉", "㋀", "㋁", "㋂", "㋃", "㋄", "㋅", "㋆", "㋇", "㋈", "㋉", "㋊", "㋋", "㏠", "㏡", "㏢", "㏣", "㏤", "㏥", "㏦", "㏧", "㏨", "㏩", "㏪", "㏫", "㏬", "㏭", "㏮", "㏯", "㏰", "㏱", "㏲", "㏳", "㏴", "㏵", "㏶", "㏷", "㏸", "㏹", "㏺", "㏻", "㏼", "㏽", "㏾", "㍙", "㍚", "㍛", "㍜", "㍝", "㍞", "㍟", "㍠", "㍡", "㍢", "㍣", "㍤", "㍥", "㍦", "㍧", "㍨", "㍩", "㍪", "㍫", "㍬", "㍭", "㍮", "㍯", "㍰", "㍘", "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾", "佰", "仟", "弍", "弎", "弐", "朤", "氺", "曱", "甴",),
    )

    val emoticonData: Map<Category, List<String>> = linkedMapOf(
        Category("^_^", R.drawable.icon_emoticon_1) to listOf("^^;", "^_^;", "(^^ゞ", "(・・;", "(;_;", "(・・;)", "(*_*;", "(ーー;)", "(^o^;", "(゜o゜;", "(・。・;", "(^.^;", "(@@;)", "(¯―¯٥)", "(^_^;)", "(-_-;)", "('・ω・')", "(°ー°〃)", "(ーー゛)", "(~_~;)", "(；´Д｀)", "(^o^;)", "(；・∀・)", "(；´∀｀)", "(-.-;)", "(・_・;)", "(＠_＠;)", "（；^ω^）", "(；一_一)", "(_ _;)", "(^O^;)", "(~O~;)", "(・.・;)", "(=o=;)", "(-_-;)", "(~_~;)", "(-.-;)", "(；一_一)", "(~O~;)", "(=o=;)", "(´∀｀；)", "(´-﹏-`；)", "(ㆀ˘･з･˘)", "(_ _;)m", "(_ _;)m", "( •̀ㅁ•́;)", "(； ･`д･´)"),
        Category("(*_*)", R.drawable.icon_emoticon_2) to listOf( ":-O", ":-|", "(゜゜)", "(@_@)", "(*_*)", "(+_+)", "(・o・)", "(゜o゜)", "(゜-゜)", "(?_?)", "(ﾟДﾟ)", "( ﾟдﾟ)", "＼(◎o◎)／", "(✽ ﾟдﾟ ✽)", "≡≡ﾍ( ´Д`)ﾉ"),
        Category("(TT)", R.drawable.icon_emoticon_3) to listOf("(TT)", "(__)", "(;_;", "(´Д⊂ヽ", "(T_T)", "(;_;)", "(._.)", "(ToT)", "(_ _)", "(/_;)", "(:_;)", "(;O;)", "(TдT)", "(TOT)", "(;_:)", "|￣|○", "(_ _;)", "(¯―¯٥)", "(__)m", "(｡ŏ﹏ŏ)", "(ヽ´ω`)", "( ；∀；)", "(･ัω･ั)", "(_^_)_", "(._.)_", "(_ _)m", "(*´﹃｀*)", "(´・ω・`)", "(´・ω・｀)", "(´；ω；｀)", "(´д⊂)‥ﾊｩ", "( ･ั﹏･ั)", "(つд⊂)ｴｰﾝ", "(_ _;)m", "( ´Д｀)=3", "(ﾉД`)ｼｸｼｸ", "(๑´0`๑)۶", "(ToT)/~~~", "(;_;)/~~~", "(T_T)/~~~", "(´；ω；｀)ｳｯ…", "｡ﾟ(ﾟ´Д｀ﾟ)ﾟ｡", "(´；ω；｀)ﾌﾞﾜｯ", "(๑´•.̫ • `๑)", "(´ . .̫ . `)", "｡･ﾟ･(ﾉД`)･ﾟ･｡", "｡･ﾟ･(ﾉ∀`)･ﾟ･｡", "(´°̥̥̥̥̥̥̥̥ω°̥̥̥̥̥̥̥̥｀)",),
        Category("(-_-)", R.drawable.icon_emoticon_4) to listOf(":(", ":|", ":-(", ":-P", "=_=", "(--)", "(｀´）", "(-_-)", "(-.-)", "(=_=)", "(︶^︶)", "→_→", "←_←", "(~o~)", "(~_~)", "(~O~)", "(ー_ー)", "( 一一)", "(・へ・)", "(ーー゛)", "(－－〆)", "(#･∀･)", "(-_-;)", "(~_~;)", "(-.-;)", "(=_=;)", "(~O~;)", "(=o=;)", "(-_-メ)", "(~_~メ)", "(^_^メ)", "(ー_ー;)", "(；一_一)", "((+_+))", "(# ﾟДﾟ)", "( ´Д｀)=3", "(๑`^´๑)۶", "(๑òωó๑)۶",),
        Category("(･∀･)", R.drawable.icon_emoticon_5) to listOf("(⌒▽⌒)", "（￣▽￣）", "(=・ω・=)", "(｀・ω・´)", "(〜￣△￣)〜", "(･∀･)", "(°∀°)ﾉ", "(￣3￣)", "╮(￣▽￣)╭", "_(:3」∠)_", "( ´_ゝ｀)", "←_←", "→_→", "(<_<)", "(>_>)", "(;¬_¬)", "(\"▔□▔)/", "(ﾟДﾟ≡ﾟдﾟ)!?", "Σ(ﾟдﾟ;)", "Σ( ￣□￣||)", "(´；ω；`)", "（/TДT)/", "(^・ω・^ )", "(｡･ω･｡)", "(●￣(ｴ)￣●)", "ε=ε=(ノ≧∇≦)ノ", "(´･_･`)", "(-_-#)", "（￣へ￣）", "(￣ε(#￣) Σ", "ヽ(`Д´)ﾉ", "（#-_-)┯━┯", "(╯°口°)╯(┴—┴", "←◡←", "( ♥д♥)", "Σ>―(〃°ω°〃)♡→", "⁄(⁄ ⁄•⁄ω⁄•⁄ ⁄)⁄", "(╬ﾟдﾟ)▄︻┻┳═一", "･*･:≡(　ε:)", "¯\\_(ツ)_/¯"),
    )

    val emojiconData: Map<Category, List<String>>
    init {
        val emojiCompatInstance = YuyanEmojiCompat.getAsFlow().value
        val emojicons: Map<Category, List<String>> = linkedMapOf(
            Category("🕝" , R.drawable.icon_emojibar_recents) to emptyList(),
            Category("🔥", R.drawable.icon_emojibar_hot) to listOf("🌝🌝", "🌚🌚", "🐂🍺", "🤙🤙🤙", "💖你", "🦀🦀", "😅😅😅", "嘿嘿🤤🤤🤤", "出🚪😷", "勤💧🤲", "🍐🎼", "👉👈", "🧡ྀི💛ྀི❤️ྀི", "🉑🉑💗💗", "🌹🌹🌹", "💗🐯🈶", "ᥬ🌝᭄", "ᥬ🌚᭄", "ᥬ😂᭄", "(   ˊ ᵕ ˋ 💦)", "🤺💨退‼️", "👍👍👍对对对", "8️⃣🅱️Q了", "🍚⚔️", "老🤙", "🧯Q", "☁️？", "🌪️我👄里", "🌞☀️🥵☀️🌞", "有🧊", "冒🍚了", "📰👀", "📰😋", "🐮🐴💃🕺", "⬆️👄", "⬇️👄", "❤️👄", "💘💘💘", "🌪️😭", "太✔️🌶️", "🛡️🦶", "❤️你1️⃣万年", "💖里有你", "😘😘😘", "单身🐶", "着🥝", "好🥥", "🍎啥", "完🥚", "🍐解", "烦💩了", "🌸心", "有🍅", "😁👍", "你🍓🍅吧", "真🍰😁", "🍑跑", "🍓事", "绝绝子🎶📢", "开💗💗", "吃🍑🍑", "吃🍉🍉", "吃🍋🍋", "吃🐳🐳", "🌬️🐮🐝", "🐚❎住了", "🈶🧊😅", "开炫🍊🍊🍊", "😙❤️", "🎤给你", "🎤🐈", "👌格局小了", "✊格局正好", "👐格局打开", "🖖格局裂开", "整挺好👍👍👍", "👏👏👏优秀", "🈶1️⃣说1️⃣", "🉑🈶🉑🈚", "1️⃣🕸️💗深", "🍻🍚了", "🤡😀🤡🤡", "😀🔍🤡", "🈯🈯👉👉", "玩🎠", "阿巴阿巴😦😦😦", "🕊️💊❗", "🌶️🐔", "♡💌♡", "🍌💚", "来💃💃🎊🕺🕺", "👂懂👏👏", "🈶👀🈚🐷", "🍑💨", "🈶内👻", "🦈🦅", "🌶️👀", "🍾+🍋+🌿+🍒=🍹", "👅🐶", "🍓🚪", "👶怕", "在🦌上", "👣❤️", "🐒颜🈚😁", "🕳️👨", "我💔开", "🕊️💋", "搞🥢点", "你在想🍑", "🈶🈚吃🐔", "🈶🈚王者", "🎣🐡🐠🐟🦞", "送你🌸🌸", "💗💗💗加速", "和我👩‍❤️‍👨8️⃣", "给👴爪巴", "🐂🍺🐃🍺🐄🍺", "给👴🏻整笑了", "关你💨事", "🐊❤️", "胖成🐷了", "我🍋了", "🉑以", "你是🐷吗", "🌈💨", "我拒绝❌", "👴❤️了", "🌨🌨🌨", "💰💴💵💶💷", "晚安💤🌙", "🐴 了", "🔒了", "吃💩", "我🤮了", "🙄🙃", "我👀到了", "我💥了", "🤤🍦", "傻🐷🐷", "🗝️您配吗", "大吃一🐳", "下🌧️了", "打🏀吗", "💯💯💯", "💪💪💪", "👌👌👌", "👋👋👋", "💢💢💢", "🙉🙉🙉", "🙈🙈🙈", "😒😒😒", "😆😆😆", "🥺🥺🥺", "✨((🌕⥎🌕))✨", "🌿((🌑⥎🌑))🌿", "🌹((❤️⥎❤️))🌹", "💐((🌺⥎🌺))🌹", "🌸((☀️⥎☀️))🌸", "🍃((🌳⥎🌳))🍃", "🍂((🍁⥎🍁))🍂", "☃️((❄️⥎❄️))☃️", "💥((🔥⥎🔥))💥", "💥((💣⥎💣))💥", "🚞🚃🚃🚃💨", "🌑🌒🌓🌔🌕🌖🌗🌘🌑",),
            Category("🙂", R.drawable.icon_emojibar_smileys) to listOf("😀", "😃", "😄", "😁", "😆", "😅", "🤣", "😂", "🙂", "🙃", "🫠", "😉", "😊", "😇", "🥰", "😍", "🤩", "😘", "😗", "☺️", "😚", "😙", "🥲", "😋", "😛", "😜", "🤪", "😝", "🤑", "🤗", "🤭", "🫢", "🫣", "🤫", "🤔", "🫡", "🤐", "🤨", "😐", "😑", "😶", "🫥", "😶‍🌫️", "😏", "😒", "🙄", "😬", "😮‍💨", "🤥", "🫨", "🙂‍↔️", "🙂‍↕️", "😌", "😔", "😪", "🤤", "😴", "😷", "🤒", "🤕", "🤢", "🤮", "🤧", "🥵", "🥶", "🥴", "😵", "😵‍💫", "🤯", "🤠", "🥳", "🥸", "😎", "🤓", "🧐", "😕", "🫤", "😟", "🙁", "☹️", "😮", "😯", "😲", "😳", "🥺", "🥹", "😦", "😧", "😨", "😰", "😥", "😢", "😭", "😱", "😖", "😣", "😞", "😓", "😩", "😫", "🥱", "😤", "😡", "😠", "🤬", "😈", "👿", "💀", "☠️", "💩", "🤡", "👹", "👺", "👻", "👽", "👾", "🤖", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "🙈", "🙉", "🙊", "💌", "💘", "💝", "💖", "💗", "💓", "💞", "💕", "💟", "❣️", "💔", "❤️‍🔥", "❤️‍🩹", "❤️", "🩷", "🧡", "💛", "💚", "💙", "🩵", "💜", "🤎", "🖤", "🩶", "🤍", "💋", "💯", "💢", "💥", "💫", "💦", "💨", "🕳️", "💬", "👁️‍🗨️", "🗨️", "🗯️", "💭", "💤",),
            Category("🧑", R.drawable.icon_emojibar_people) to listOf("👋", "🤚", "🖐️", "✋", "🖖", "🫱", "🫲", "🫳", "🫴", "🫷", "🫸", "👌", "🤌", "🤏", "✌️", "🤞", "🫰", "🤟", "🤘", "🤙", "👈", "👉", "👆", "🖕", "👇", "☝️", "🫵", "👍", "👎", "✊", "👊", "🤛", "🤜", "👏", "🙌", "🫶", "👐", "🤲", "🤝", "🙏", "✍️", "💅", "🤳", "💪", "🦾", "🦿", "🦵", "🦶", "👂", "🦻", "👃", "🧠", "🫀", "🫁", "🦷", "🦴", "👀", "👁️", "👅", "👄", "🫦", "👶", "🧒", "👦", "👧", "🧑", "👱", "👨", "🧔", "🧔‍♂️", "🧔‍♀️", "👨‍🦰", "👨‍🦱", "👨‍🦳", "👨‍🦲", "👩", "👩‍🦰", "🧑‍🦰", "👩‍🦱", "🧑‍🦱", "👩‍🦳", "🧑‍🦳", "👩‍🦲", "🧑‍🦲", "👱‍♀️", "👱‍♂️", "🧓", "👴", "👵", "🙍", "🙍‍♂️", "🙍‍♀️", "🙎", "🙎‍♂️", "🙎‍♀️", "🙅", "🙅‍♂️", "🙅‍♀️", "🙆", "🙆‍♂️", "🙆‍♀️", "💁", "💁‍♂️", "💁‍♀️", "🙋", "🙋‍♂️", "🙋‍♀️", "🧏", "🧏‍♂️", "🧏‍♀️", "🙇", "🙇‍♂️", "🙇‍♀️", "🤦", "🤦‍♂️", "🤦‍♀️", "🤷", "🤷‍♂️", "🤷‍♀️", "🧑‍⚕️", "👨‍⚕️", "👩‍⚕️", "🧑‍🎓", "👨‍🎓", "👩‍🎓", "🧑‍🏫", "👨‍🏫", "👩‍🏫", "🧑‍⚖️", "👨‍⚖️", "👩‍⚖️", "🧑‍🌾", "👨‍🌾", "👩‍🌾", "🧑‍🍳", "👨‍🍳", "👩‍🍳", "🧑‍🔧", "👨‍🔧", "👩‍🔧", "🧑‍🏭", "👨‍🏭", "👩‍🏭", "🧑‍💼", "👨‍💼", "👩‍💼", "🧑‍🔬", "👨‍🔬", "👩‍🔬", "🧑‍💻", "👨‍💻", "👩‍💻", "🧑‍🎤", "👨‍🎤", "👩‍🎤", "🧑‍🎨", "👨‍🎨", "👩‍🎨", "🧑‍✈️", "👨‍✈️", "👩‍✈️", "🧑‍🚀", "👨‍🚀", "👩‍🚀", "🧑‍🚒", "👨‍🚒", "👩‍🚒", "👮", "👮‍♂️", "👮‍♀️", "🕵️", "🕵️‍♂️", "🕵️‍♀️", "💂", "💂‍♂️", "💂‍♀️", "🥷", "👷", "👷‍♂️", "👷‍♀️", "🫅", "🤴", "👸", "👳", "👳‍♂️", "👳‍♀️", "👲", "🧕", "🤵", "🤵‍♂️", "🤵‍♀️", "👰", "👰‍♂️", "👰‍♀️", "🤰", "🫃", "🫄", "🤱", "👩‍🍼", "👨‍🍼", "🧑‍🍼", "👼", "🎅", "🤶", "🧑‍🎄", "🦸", "🦸‍♂️", "🦸‍♀️", "🦹", "🦹‍♂️", "🦹‍♀️", "🧙", "🧙‍♂️", "🧙‍♀️", "🧚", "🧚‍♂️", "🧚‍♀️", "🧛", "🧛‍♂️", "🧛‍♀️", "🧜", "🧜‍♂️", "🧜‍♀️", "🧝", "🧝‍♂️", "🧝‍♀️", "🧞", "🧞‍♂️", "🧞‍♀️", "🧟", "🧟‍♂️", "🧟‍♀️", "🧌", "💆", "💆‍♂️", "💆‍♀️", "💇", "💇‍♂️", "💇‍♀️", "🚶", "🚶‍♂️", "🚶‍♀️", "🚶‍➡️", "🚶‍♀️‍➡️", "🚶‍♂️‍➡️", "🧍", "🧍‍♂️", "🧍‍♀️", "🧎", "🧎‍♂️", "🧎‍♀️", "🧎‍➡️", "🧎‍♀️‍➡️", "🧎‍♂️‍➡️", "🧑‍🦯", "🧑‍🦯‍➡️", "👨‍🦯", "👨‍🦯‍➡️", "👩‍🦯", "👩‍🦯‍➡️", "🧑‍🦼", "🧑‍🦼‍➡️", "👨‍🦼", "👨‍🦼‍➡️", "👩‍🦼", "👩‍🦼‍➡️", "🧑‍🦽", "🧑‍🦽‍➡️", "👨‍🦽", "👨‍🦽‍➡️", "👩‍🦽", "👩‍🦽‍➡️", "🏃", "🏃‍♂️", "🏃‍♀️", "🏃‍➡️", "🏃‍♀️‍➡️", "🏃‍♂️‍➡️", "💃", "🕺", "🕴️", "👯", "👯‍♂️", "👯‍♀️", "🧖", "🧖‍♂️", "🧖‍♀️", "🧗", "🧗‍♂️", "🧗‍♀️", "🤺", "🏇", "⛷️", "🏂", "🏌️", "🏌️‍♂️", "🏌️‍♀️", "🏄", "🏄‍♂️", "🏄‍♀️", "🚣", "🚣‍♂️", "🚣‍♀️", "🏊", "🏊‍♂️", "🏊‍♀️", "⛹️", "⛹️‍♂️", "⛹️‍♀️", "🏋️", "🏋️‍♂️", "🏋️‍♀️", "🚴", "🚴‍♂️", "🚴‍♀️", "🚵", "🚵‍♂️", "🚵‍♀️", "🤸", "🤸‍♂️", "🤸‍♀️", "🤼", "🤼‍♂️", "🤼‍♀️", "🤽", "🤽‍♂️", "🤽‍♀️", "🤾", "🤾‍♂️", "🤾‍♀️", "🤹", "🤹‍♂️", "🤹‍♀️", "🧘", "🧘‍♂️", "🧘‍♀️", "🛀", "🛌", "🧑‍🤝‍🧑", "👭", "👫", "👬", "💏", "👩‍❤️‍💋‍👨", "👨‍❤️‍💋‍👨", "👩‍❤️‍💋‍👩", "💑", "👩‍❤️‍👨", "👨‍❤️‍👨", "👩‍❤️‍👩", "👨‍👩‍👦", "👨‍👩‍👧", "👨‍👩‍👧‍👦", "👨‍👩‍👦‍👦", "👨‍👩‍👧‍👧", "👨‍👨‍👦", "👨‍👨‍👧", "👨‍👨‍👧‍👦", "👨‍👨‍👦‍👦", "👨‍👨‍👧‍👧", "👩‍👩‍👦", "👩‍👩‍👧", "👩‍👩‍👧‍👦", "👩‍👩‍👦‍👦", "👩‍👩‍👧‍👧", "👨‍👦", "👨‍👦‍👦", "👨‍👧", "👨‍👧‍👦", "👨‍👧‍👧", "👩‍👦", "👩‍👦‍👦", "👩‍👧", "👩‍👧‍👦", "👩‍👧‍👧", "🗣️", "👤", "👥", "🫂", "👪", "🧑‍🧑‍🧒", "🧑‍🧑‍🧒‍🧒", "🧑‍🧒", "🧑‍🧒‍🧒", "👣",),
            Category("🌸", R.drawable.icon_emojibar_nature) to listOf("🐵", "🐒", "🦍", "🦧", "🐶", "🐕", "🦮", "🐕‍🦺", "🐩", "🐺", "🦊", "🦝", "🐱", "🐈", "🐈‍⬛", "🦁", "🐯", "🐅", "🐆", "🐴", "🫎", "🫏", "🐎", "🦄", "🦓", "🦌", "🦬", "🐮", "🐂", "🐃", "🐄", "🐷", "🐖", "🐗", "🐽", "🐏", "🐑", "🐐", "🐪", "🐫", "🦙", "🦒", "🐘", "🦣", "🦏", "🦛", "🐭", "🐁", "🐀", "🐹", "🐰", "🐇", "🐿️", "🦫", "🦔", "🦇", "🐻", "🐻‍❄️", "🐨", "🐼", "🦥", "🦦", "🦨", "🦘", "🦡", "🐾", "🦃", "🐔", "🐓", "🐣", "🐤", "🐥", "🐦", "🐧", "🕊️", "🦅", "🦆", "🦢", "🦉", "🦤", "🪶", "🦩", "🦚", "🦜", "🪽", "🐦‍⬛", "🪿", "🐦‍🔥", "🐸", "🐊", "🐢", "🦎", "🐍", "🐲", "🐉", "🦕", "🦖", "🐳", "🐋", "🐬", "🦭", "🐟", "🐠", "🐡", "🦈", "🐙", "🐚", "🪸", "🪼", "🐌", "🦋", "🐛", "🐜", "🐝", "🪲", "🐞", "🦗", "🪳", "🕷️", "🕸️", "🦂", "🦟", "🪰", "🪱", "🦠", "💐", "🌸", "💮", "🪷", "🏵️", "🌹", "🥀", "🌺", "🌻", "🌼", "🌷", "🪻", "🌱", "🪴", "🌲", "🌳", "🌴", "🌵", "🌾", "🌿", "☘️", "🍀", "🍁", "🍂", "🍃", "🪹", "🪺", "🍄",),
            Category("🎂", R.drawable.icon_emojibar_food) to listOf("🍇", "🍈", "🍉", "🍊", "🍋", "🍋‍🟩", "🍌", "🍍", "🥭", "🍎", "🍏", "🍐", "🍑", "🍒", "🍓", "🫐", "🥝", "🍅", "🫒", "🥥", "🥑", "🍆", "🥔", "🥕", "🌽", "🌶️", "🫑", "🥒", "🥬", "🥦", "🧄", "🧅", "🥜", "🫘", "🌰", "🫚", "🫛", "🍄‍🟫", "🍞", "🥐", "🥖", "🫓", "🥨", "🥯", "🥞", "🧇", "🧀", "🍖", "🍗", "🥩", "🥓", "🍔", "🍟", "🍕", "🌭", "🥪", "🌮", "🌯", "🫔", "🥙", "🧆", "🥚", "🍳", "🥘", "🍲", "🫕", "🥣", "🥗", "🍿", "🧈", "🧂", "🥫", "🍱", "🍘", "🍙", "🍚", "🍛", "🍜", "🍝", "🍠", "🍢", "🍣", "🍤", "🍥", "🥮", "🍡", "🥟", "🥠", "🥡", "🦀", "🦞", "🦐", "🦑", "🦪", "🍦", "🍧", "🍨", "🍩", "🍪", "🎂", "🍰", "🧁", "🥧", "🍫", "🍬", "🍭", "🍮", "🍯", "🍼", "🥛", "☕", "🫖", "🍵", "🍶", "🍾", "🍷", "🍸", "🍹", "🍺", "🍻", "🥂", "🥃", "🫗", "🥤", "🧋", "🧃", "🧉", "🧊", "🥢", "🍽️", "🍴", "🥄", "🔪", "🫙", "🏺",),
            Category("🚘", R.drawable.icon_emojibar_car) to listOf("🌍", "🌎", "🌏", "🌐", "🗺️", "🗾", "🧭", "🏔️", "⛰️", "🌋", "🗻", "🏕️", "🏖️", "🏜️", "🏝️", "🏞️", "🏟️", "🏛️", "🏗️", "🧱", "🪨", "🪵", "🛖", "🏘️", "🏚️", "🏠", "🏡", "🏢", "🏣", "🏤", "🏥", "🏦", "🏨", "🏩", "🏪", "🏫", "🏬", "🏭", "🏯", "🏰", "💒", "🗼", "🗽", "⛪", "🕌", "🛕", "🕍", "⛩️", "🕋", "⛲", "⛺", "🌁", "🌃", "🏙️", "🌄", "🌅", "🌆", "🌇", "🌉", "♨️", "🎠", "🛝", "🎡", "🎢", "💈", "🎪", "🚂", "🚃", "🚄", "🚅", "🚆", "🚇", "🚈", "🚉", "🚊", "🚝", "🚞", "🚋", "🚌", "🚍", "🚎", "🚐", "🚑", "🚒", "🚓", "🚔", "🚕", "🚖", "🚗", "🚘", "🚙", "🛻", "🚚", "🚛", "🚜", "🏎️", "🏍️", "🛵", "🦽", "🦼", "🛺", "🚲", "🛴", "🛹", "🛼", "🚏", "🛣️", "🛤️", "🛢️", "⛽", "🛞", "🚨", "🚥", "🚦", "🛑", "🚧", "⚓", "🛟", "⛵", "🛶", "🚤", "🛳️", "⛴️", "🛥️", "🚢", "✈️", "🛩️", "🛫", "🛬", "🪂", "💺", "🚁", "🚟", "🚠", "🚡", "🛰️", "🚀", "🛸", "🛎️", "🧳", "⌛", "⏳", "⌚", "⏰", "⏱️", "⏲️", "🕰️", "🕛", "🕧", "🕐", "🕜", "🕑", "🕝", "🕒", "🕞", "🕓", "🕟", "🕔", "🕠", "🕕", "🕡", "🕖", "🕢", "🕗", "🕣", "🕘", "🕤", "🕙", "🕥", "🕚", "🕦", "🌑", "🌒", "🌓", "🌔", "🌕", "🌖", "🌗", "🌘", "🌙", "🌚", "🌛", "🌜", "🌡️", "☀️", "🌝", "🌞", "🪐", "⭐", "🌟", "🌠", "🌌", "☁️", "⛅", "⛈️", "🌤️", "🌥️", "🌦️", "🌧️", "🌨️", "🌩️", "🌪️", "🌫️", "🌬️", "🌀", "🌈", "🌂", "☂️", "☔", "⛱️", "⚡", "❄️", "☃️", "⛄", "☄️", "🔥", "💧", "🌊",),
            Category("⚽", R.drawable.icon_emojibar_activity) to listOf("🎃", "🎄", "🎆", "🎇", "🧨", "✨", "🎈", "🎉", "🎊", "🎋", "🎍", "🎎", "🎏", "🎐", "🎑", "🧧", "🎀", "🎁", "🎗️", "🎟️", "🎫", "🎖️", "🏆", "🏅", "🥇", "🥈", "🥉", "⚽", "⚾", "🥎", "🏀", "🏐", "🏈", "🏉", "🎾", "🥏", "🎳", "🏏", "🏑", "🏒", "🥍", "🏓", "🏸", "🥊", "🥋", "🥅", "⛳", "⛸️", "🎣", "🤿", "🎽", "🎿", "🛷", "🥌", "🎯", "🪀", "🪁", "🔫", "🎱", "🔮", "🪄", "🎮", "🕹️", "🎰", "🎲", "🧩", "🧸", "🪅", "🪩", "🪆", "♠️", "♥️", "♦️", "♣️", "♟️", "🃏", "🀄", "🎴", "🎭", "🖼️", "🎨", "🧵", "🪡", "🧶", "🪢",),
            Category("💡", R.drawable.icon_emojibar_objects) to listOf("👓", "🕶️", "🥽", "🥼", "🦺", "👔", "👕", "👖", "🧣", "🧤", "🧥", "🧦", "👗", "👘", "🥻", "🩱", "🩲", "🩳", "👙", "👚", "🪭", "👛", "👜", "👝", "🛍️", "🎒", "🩴", "👞", "👟", "🥾", "🥿", "👠", "👡", "🩰", "👢", "🪮", "👑", "👒", "🎩", "🎓", "🧢", "🪖", "⛑️", "📿", "💄", "💍", "💎", "🔇", "🔈", "🔉", "🔊", "📢", "📣", "📯", "🔔", "🔕", "🎼", "🎵", "🎶", "🎙️", "🎚️", "🎛️", "🎤", "🎧", "📻", "🎷", "🪗", "🎸", "🎹", "🎺", "🎻", "🪕", "🥁", "🪘", "🪇", "🪈", "📱", "📲", "☎️", "📞", "📟", "📠", "🔋", "🪫", "🔌", "💻", "🖥️", "🖨️", "⌨️", "🖱️", "🖲️", "💽", "💾", "💿", "📀", "🧮", "🎥", "🎞️", "📽️", "🎬", "📺", "📷", "📸", "📹", "📼", "🔍", "🔎", "🕯️", "💡", "🔦", "🏮", "🪔", "📔", "📕", "📖", "📗", "📘", "📙", "📚", "📓", "📒", "📃", "📜", "📄", "📰", "🗞️", "📑", "🔖", "🏷️", "💰", "🪙", "💴", "💵", "💶", "💷", "💸", "💳", "🧾", "💹", "✉️", "📧", "📨", "📩", "📤", "📥", "📦", "📫", "📪", "📬", "📭", "📮", "🗳️", "✏️", "✒️", "🖋️", "🖊️", "🖌️", "🖍️", "📝", "💼", "📁", "📂", "🗂️", "📅", "📆", "🗒️", "🗓️", "📇", "📈", "📉", "📊", "📋", "📌", "📍", "📎", "🖇️", "📏", "📐", "✂️", "🗃️", "🗄️", "🗑️", "🔒", "🔓", "🔏", "🔐", "🔑", "🗝️", "🔨", "🪓", "⛏️", "⚒️", "🛠️", "🗡️", "⚔️", "💣", "🪃", "🏹", "🛡️", "🪚", "🔧", "🪛", "🔩", "⚙️", "🗜️", "⚖️", "🦯", "🔗", "⛓️‍💥", "⛓️", "🪝", "🧰", "🧲", "🪜", "⚗️", "🧪", "🧫", "🧬", "🔬", "🔭", "📡", "💉", "🩸", "💊", "🩹", "🩼", "🩺", "🩻", "🚪", "🛗", "🪞", "🪟", "🛏️", "🛋️", "🪑", "🚽", "🪠", "🚿", "🛁", "🪤", "🪒", "🧴", "🧷", "🧹", "🧺", "🧻", "🪣", "🧼", "🫧", "🪥", "🧽", "🧯", "🛒", "🚬", "⚰️", "🪦", "⚱️", "🧿", "🪬", "🗿", "🪧", "🪪",),
            Category("🔣", R.drawable.icon_emojibar_symbols) to listOf("🏧", "🚮", "🚰", "♿", "🚹", "🚺", "🚻", "🚼", "🚾", "🛂", "🛃", "🛄", "🛅", "⚠️", "🚸", "⛔", "🚫", "🚳", "🚭", "🚯", "🚱", "🚷", "📵", "🔞", "☢️", "☣️", "⬆️", "↗️", "➡️", "↘️", "⬇️", "↙️", "⬅️", "↖️", "↕️", "↔️", "↩️", "↪️", "⤴️", "⤵️", "🔃", "🔄", "🔙", "🔚", "🔛", "🔜", "🔝", "🛐", "⚛️", "🕉️", "✡️", "☸️", "☯️", "✝️", "☦️", "☪️", "☮️", "🕎", "🔯", "🪯", "♈", "♉", "♊", "♋", "♌", "♍", "♎", "♏", "♐", "♑", "♒", "♓", "⛎", "🔀", "🔁", "🔂", "▶️", "⏩", "⏭️", "⏯️", "◀️", "⏪", "⏮️", "🔼", "⏫", "🔽", "⏬", "⏸️", "⏹️", "⏺️", "⏏️", "🎦", "🔅", "🔆", "📶", "🛜", "📳", "📴", "♀️", "♂️", "⚧️", "✖️", "➕", "➖", "➗", "🟰", "♾️", "‼️", "⁉️", "❓", "❔", "❕", "❗", "〰️", "💱", "💲", "⚕️", "♻️", "⚜️", "🔱", "📛", "🔰", "⭕", "✅", "☑️", "✔️", "❌", "❎", "➰", "➿", "〽️", "✳️", "✴️", "❇️", "©️", "®️", "™️", "#️⃣", "*️⃣", "0️⃣", "1️⃣", "2️⃣", "3️⃣", "4️⃣", "5️⃣", "6️⃣", "7️⃣", "8️⃣", "9️⃣", "🔟", "🔠", "🔡", "🔢", "🔣", "🔤", "🅰️", "🆎", "🅱️", "🆑", "🆒", "🆓", "ℹ️", "🆔", "Ⓜ️", "🆕", "🆖", "🅾️", "🆗", "🅿️", "🆘", "🆙", "🆚", "🈁", "🈂️", "🈷️", "🈶", "🈯", "🉐", "🈹", "🈚", "🈲", "🉑", "🈸", "🈴", "🈳", "㊗️", "㊙️", "🈺", "🈵", "🔴", "🟠", "🟡", "🟢", "🔵", "🟣", "🟤", "⚫", "⚪", "🟥", "🟧", "🟨", "🟩", "🟦", "🟪", "🟫", "⬛", "⬜", "◼️", "◻️", "◾", "◽", "▪️", "▫️", "🔶", "🔷", "🔸", "🔹", "🔺", "🔻", "💠", "🔘", "🔳", "🔲",),
            Category("🏁", R.drawable.icon_emojibar_flags) to listOf("🏁", "🚩", "🎌", "🏴", "🏳️", "🏳️‍🌈", "🏳️‍⚧️", "🏴‍☠️", "🇦🇨", "🇦🇩", "🇦🇪", "🇦🇫", "🇦🇬", "🇦🇮", "🇦🇱", "🇦🇲", "🇦🇴", "🇦🇶", "🇦🇷", "🇦🇸", "🇦🇹", "🇦🇺", "🇦🇼", "🇦🇽", "🇦🇿", "🇧🇦", "🇧🇧", "🇧🇩", "🇧🇪", "🇧🇫", "🇧🇬", "🇧🇭", "🇧🇮", "🇧🇯", "🇧🇱", "🇧🇲", "🇧🇳", "🇧🇴", "🇧🇶", "🇧🇷", "🇧🇸", "🇧🇹", "🇧🇻", "🇧🇼", "🇧🇾", "🇧🇿", "🇨🇦", "🇨🇨", "🇨🇩", "🇨🇫", "🇨🇬", "🇨🇭", "🇨🇮", "🇨🇰", "🇨🇱", "🇨🇲", "🇨🇳", "🇨🇴", "🇨🇵", "🇨🇷", "🇨🇺", "🇨🇻", "🇨🇼", "🇨🇽", "🇨🇾", "🇨🇿", "🇩🇪", "🇩🇬", "🇩🇯", "🇩🇰", "🇩🇲", "🇩🇴", "🇩🇿", "🇪🇦", "🇪🇨", "🇪🇪", "🇪🇬", "🇪🇭", "🇪🇷", "🇪🇸", "🇪🇹", "🇪🇺", "🇫🇮", "🇫🇯", "🇫🇰", "🇫🇲", "🇫🇴", "🇫🇷", "🇬🇦", "🇬🇧", "🇬🇩", "🇬🇪", "🇬🇫", "🇬🇬", "🇬🇭", "🇬🇮", "🇬🇱", "🇬🇲", "🇬🇳", "🇬🇵", "🇬🇶", "🇬🇷", "🇬🇸", "🇬🇹", "🇬🇺", "🇬🇼", "🇬🇾", "🇭🇰", "🇭🇲", "🇭🇳", "🇭🇷", "🇭🇹", "🇭🇺", "🇮🇨", "🇮🇩", "🇮🇪", "🇮🇱", "🇮🇲", "🇮🇳", "🇮🇴", "🇮🇶", "🇮🇷", "🇮🇸", "🇮🇹", "🇯🇪", "🇯🇲", "🇯🇴", "🇯🇵", "🇰🇪", "🇰🇬", "🇰🇭", "🇰🇮", "🇰🇲", "🇰🇳", "🇰🇵", "🇰🇷", "🇰🇼", "🇰🇾", "🇰🇿", "🇱🇦", "🇱🇧", "🇱🇨", "🇱🇮", "🇱🇰", "🇱🇷", "🇱🇸", "🇱🇹", "🇱🇺", "🇱🇻", "🇱🇾", "🇲🇦", "🇲🇨", "🇲🇩", "🇲🇪", "🇲🇫", "🇲🇬", "🇲🇭", "🇲🇰", "🇲🇱", "🇲🇲", "🇲🇳", "🇲🇴", "🇲🇵", "🇲🇶", "🇲🇷", "🇲🇸", "🇲🇹", "🇲🇺", "🇲🇻", "🇲🇼", "🇲🇽", "🇲🇾", "🇲🇿", "🇳🇦", "🇳🇨", "🇳🇪", "🇳🇫", "🇳🇬", "🇳🇮", "🇳🇱", "🇳🇴", "🇳🇵", "🇳🇷", "🇳🇺", "🇳🇿", "🇴🇲", "🇵🇦", "🇵🇪", "🇵🇫", "🇵🇬", "🇵🇭", "🇵🇰", "🇵🇱", "🇵🇲", "🇵🇳", "🇵🇷", "🇵🇸", "🇵🇹", "🇵🇼", "🇵🇾", "🇶🇦", "🇷🇪", "🇷🇴", "🇷🇸", "🇷🇺", "🇷🇼", "🇸🇦", "🇸🇧", "🇸🇨", "🇸🇩", "🇸🇪", "🇸🇬", "🇸🇭", "🇸🇮", "🇸🇯", "🇸🇰", "🇸🇱", "🇸🇲", "🇸🇳", "🇸🇴", "🇸🇷", "🇸🇸", "🇸🇹", "🇸🇻", "🇸🇽", "🇸🇾", "🇸🇿", "🇹🇦", "🇹🇨", "🇹🇩", "🇹🇫", "🇹🇬", "🇹🇭", "🇹🇯", "🇹🇰", "🇹🇱", "🇹🇲", "🇹🇳", "🇹🇴", "🇹🇷", "🇹🇹", "🇹🇻", "🇹🇼", "🇹🇿", "🇺🇦", "🇺🇬", "🇺🇲", "🇺🇳", "🇺🇸", "🇺🇾", "🇺🇿", "🇻🇦", "🇻🇨", "🇻🇪", "🇻🇬", "🇻🇮", "🇻🇳", "🇻🇺", "🇼🇫", "🇼🇸", "🇽🇰", "🇾🇪", "🇾🇹", "🇿🇦", "🇿🇲", "🇿🇼", "🏴󠁧󠁢󠁥󠁮󠁧󠁿", "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "🏴󠁧󠁢󠁷󠁬󠁳󠁿", ),
        )
        emojiconData = emojicons.mapValues { (category, emojiList) ->
            when (category.label) {
                "🔥" -> emojiList
                else -> emojiList.filter { emoji -> YuyanEmojiCompat.getEmojiMatch(emojiCompatInstance, emoji) }
            }
        }
    }
}