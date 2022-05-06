import telebot
from telebot import types
import func

bot = telebot.TeleBot('5313931976:AAFchqigvAAkb6eX0o_v77Nj6J03L_4PUAk')

@bot.message_handler(commands=['start'])
def start(message):
    mess = f'Привет, <b>{message.from_user.first_name} <u>{message.from_user.last_name }</u></b>.'
    bot.send_message(message.chat.id, mess, parse_mode='html')
    markup = types.InlineKeyboardMarkup()
    menu1 = types.InlineKeyboardButton("Факториал", callback_data="Fact")
    menu2 = types.InlineKeyboardButton('Размещение', callback_data="Accom")
    menu3 = types.InlineKeyboardButton('Сочетание', callback_data="Comb")
    menu4 = types.InlineKeyboardButton('Выборка с повторениями', callback_data="Comb_rep")
    menu5 = types.InlineKeyboardButton('Схема Бернулли', callback_data="Bernulli")
    menu6 = types.InlineKeyboardButton('теорема Муавра-Лапласа', callback_data="Laplas")
    menu7 = types.InlineKeyboardButton('Формула Пуассона', callback_data="Puasson")
    menu8 = types.InlineKeyboardButton('Квадратное уравнение', callback_data="Quad")
    markup.add(menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8)
    bot.send_message(message.chat.id,"Выбери функцию для вычислений.", reply_markup=markup)

@bot.callback_query_handler(func=lambda call: True)
def callback_inline(call):
    print(call.data)
    if call.data =='Fact':
        factMsg=bot.send_message(call.message.chat.id, "Введите целое число для вычисления факториала:", parse_mode='html')
        bot.register_next_step_handler(factMsg, callback_inline_fact_second)
    if call.data =='Accom':
        accomMsg=bot.send_message(call.message.chat.id, "Для вычисления размещения введите значения целого множества <b>n</b> и <b>m</b> через пробел:", parse_mode='html')
        bot.register_next_step_handler(accomMsg, callback_inline_accom_second)
    if call.data =='Comb':
        combMsg=bot.send_message(call.message.chat.id, "Для вычисления размещения введите значения целого множества <b>n</b> и <b>m</b> через пробел:", parse_mode='html')
        bot.register_next_step_handler(combMsg, callback_inline_comb_second)
    if call.data =='Comb_rep':
        combRepMsg=bot.send_message(call.message.chat.id, "Для вычисления выборки с повторениями введите значения целого множества <b>n</b> и <b>m</b> через пробел:", parse_mode='html')
        bot.register_next_step_handler(combRepMsg, callback_inline_combRep_second)
    if call.data =='Quad':
        quadMsg=bot.send_message(call.message.chat.id, "Для вычисления квадратного уравнения вида a*x^2+b*x+c=0 введите значения чисел <b>a,b,c</b> через пробел:", parse_mode='html')
        bot.register_next_step_handler(quadMsg, callback_inline_quad_second)
    if call.data =='Bernulli':
        bernulliMsg=bot.send_message(call.message.chat.id, "Для вычисления вероятности наступления события по схеме Бернулли, введите значения через пробел в следующем порядке:"
        "\n<b>n</b> - количество независимых испытаний"
        "\n<b>k</b> - количество появлений события А"
        "\n<b>p</b> - вероятность появления события А", parse_mode='html')
        bot.register_next_step_handler(bernulliMsg, callback_inline_bernulli_second)
    if call.data =='Laplas':
        laplasMsg=bot.send_message(call.message.chat.id, "Для вычисления вероятности наступления события по теореме Муавра-Лапласа, введите значения через пробел в следующем порядке:"
        "\n<b>n</b> - количество независимых испытаний"
        "\n<b>k</b> - количество появлений события А"
        "\n<b>p</b> - вероятность появления события А", parse_mode='html')
        bot.register_next_step_handler(laplasMsg, callback_inline_laplas_second)
    if call.data =='Puasson':
        puassonMsg=bot.send_message(call.message.chat.id, "Для вычисления вероятности наступления события по формуле Пуассона, введите значения через пробел в следующем порядке:"
        "\n<b>n</b> - количество независимых испытаний"
        "\n<b>k</b> - количество появлений события А"
        "\n<b>p</b> - вероятность появления события А", parse_mode='html')
        bot.register_next_step_handler(puassonMsg, callback_inline_puasson_second)

def callback_inline_fact_second(message):
    try:
        n = int(message.text)
        if n < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        else:
            msg = f"Ответ: факториал {n}! = {func.fac(n)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_accom_second(message):
    try:
        n = int(message.text.split(' ')[0])
        m = int(message.text.split(' ')[1])
        if n < 0 or m < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif m > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{m}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: размещение из <b>{n}</b> по <b>{m}</b> = {func.accom(n,m)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_comb_second(message):
    try:
        n = int(message.text.split(' ')[0])
        m = int(message.text.split(' ')[1])
        if n < 0 or m < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif m > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{m}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: сочетание из <b>{n}</b> по <b>{m}</b> = {func.combin(n,m)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_combRep_second(message):
    try:
        k = int(message.text.split(' ')[0])
        m = int(message.text.split(' ')[1])
        n = k + m - 1
        if n < 0 or m < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif m > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{m}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: выборка с повторениями из <b>{n}</b> по <b>{m}</b> = {func.combin(n,m)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_bernulli_second(message):
    try:
        n = int(message.text.split(' ')[0])
        k = int(message.text.split(' ')[1])
        p = float(message.text.split(' ')[2])
        if n < 0 or k < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif k > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{k}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: Вероятность P(А) из <b>{n}</b> испытаний по <b>{k}</b> появлений события А с вероятностью наступления события <b>{p}</b>= {func.bernulli(n,k,p)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_laplas_second(message):
    try:
        n = int(message.text.split(' ')[0])
        k = int(message.text.split(' ')[1])
        p = float(message.text.split(' ')[2])
        if n < 0 or k < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif k > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{k}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: Вероятность P(А) из <b>{n}</b> испытаний по <b>{k}</b> появлений события А с вероятностью наступления события <b>{p}</b>= {func.muavr_laplass(n,k,p)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_puasson_second(message):
    try:
        n = int(message.text.split(' ')[0])
        k = int(message.text.split(' ')[1])
        p = float(message.text.split(' ')[2])
        if n < 0 or k < 0:
            bot.send_message(message.chat.id, "Введено неправильное значение(отрицательное число)", parse_mode='html')
        elif k > n:
            bot.send_message(message.chat.id, "Введено неправильное значение(множество всех элементов <b>{n}</b> не может быть меньше  множества<b>{k}</b>)", parse_mode='html')
        else:
            msg = f"Ответ: Вероятность P(А) из <b>{n}</b> испытаний по <b>{k}</b> появлений события А с вероятностью наступления события <b>{p}</b>= {func.puasson(n,k,p)}"
            bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

def callback_inline_quad_second(message):
    try:
        a = float(message.text.split(' ')[0])
        b = float(message.text.split(' ')[1])
        c = float(message.text.split(' ')[2])
        msg = f"Ответ: корни уравнения {a}*x^2+({b})+({c})=0 : \n \"{func.quadro_eq(a,b,c)}\""
        bot.send_message(message.chat.id, msg, parse_mode='html')
    except Exception as e:
        bot.send_message(message.chat.id, f"Введено неправильное значение({e})", parse_mode='html')

@bot.message_handler(commands=['website'])
def website(message):
    markup = types.InlineKeyboardMarkup()
    markup.add(types.InlineKeyboardButton("Посетить веб сайт", url="http://ya.ru"))
    bot.send_message(message.chat.id, 'перейдите на сайт', reply_markup=markup)

@bot.message_handler(commands=['help'])
def help(message):
    markup = types.ReplyKeyboardMarkup(resize_keyboard=True, row_width=2)
    website = types.KeyboardButton('/website')
    start = types.KeyboardButton('/start')
    markup.add(website, start)
    bot.send_message(message.chat.id, 'список команд', reply_markup=markup)

@bot.message_handler()
def get_user_text(message):
    print(message.from_user.id, message.from_user.username, message.text)
    try:
        answer=eval(message.text)
        bot.send_message(message.chat.id, f"Ответ: <b>{answer}</b>", parse_mode='html')
    except:
        if message.text == "привет":
            bot.send_message(message.chat.id, "И тебе привет!", parse_mode='html')
            # elif message.text == "":
        elif message.text == "id":
            bot.send_message(message.chat.id, f"Твой ID: {message.from_user.id}", parse_mode='html')
        elif message.text == "photo":
            # photo = open('img.png', 'rb')
            bot.send_photo(message.chat.id, 'https://upload.wikimedia.org/wikipedia/commons/e/e1/Wilson_%22Snowflake%22_Bentley.jpg')
        else:
            bot.send_message(message.chat.id, f"Я тебя не понимаю, {message.from_user.first_name}", parse_mode='html')

@bot.message_handler(content_types=['photo'])
def get_user_photo(message):
    bot.send_message(message.chat.id, 'Норм фотка')

@bot.message_handler(content_types=['sticker'])
def get_user_sticker(message):
    bot.send_sticker(message.chat.id, 'CAACAgIAAxkBAAEEo3xidOdOyeO38Wupmd1WPfI19iGj4QACOwMAArVx2gYYSwbSVVPLRCQE')

bot.polling(none_stop='true')