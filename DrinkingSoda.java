/**
 *1.1版本
 *两块钱一瓶汽水,
 *两个空瓶子换一瓶汽水，
 *五个瓶盖换一瓶汽水，
 *现你有10元。
 *能喝几瓶汽水?
 */

class Drink
{
	private int Money = 10;
	private final int PriceOfDrink = 2;
	private int Drinks = 0;
	private int CapNumOfDrink = 0;
	private int BotNumOfDrink = 0;

	public void setMoney(int Money)
	{
		this.Money = Money;
	}
	public int getMoney()
	{
		return Money;
	}

	public void setDrinks(int Drinks)
	{
		this.Drinks = Drinks;
	}
	public int getDrinks()
	{
		return PriceOfDrink;
	}

	public void setCapNumOfDrink(int CapNumOfDrink)
	{
		this.CapNumOfDrink = CapNumOfDrink;
	}
	public int getCapNumOfDrink()
	{
		return CapNumOfDrink;
	}

	public void setBotNumOfDrink(int BotNumOfDrink)
	{
		this.BotNumOfDrink = BotNumOfDrink;
	}
	public int getBotNumOfDrink()
	{
		return BotNumOfDrink;
	}

	//输出金钱、瓶盖、空瓶子、已喝数量
	public void Print()
	{
		System.out.println(
		"金钱：" + this.Money +
		"  瓶盖数量：" + this.CapNumOfDrink +
		"  空瓶子数量" + this.BotNumOfDrink +
		"  已喝：" + this.Drinks);
	}

	//买一瓶饮料并喝掉
	public void BuyOne()
	{
		System.out.println("我购买了一瓶饮料，然后把它喝掉了~");
		this.Money -= PriceOfDrink;
		this.Drinks ++ ;
		this.CapNumOfDrink ++ ;
		this.BotNumOfDrink ++ ;
		this.Print();
	}

	//借个瓶盖
	public void BorrowCap()
	{
		this.CapNumOfDrink ++;
		System.out.println("基友借我一个瓶盖耶！");
		this.Print();
	}

	//借个空瓶子
	public void BorrowBot()
	{
		this.BotNumOfDrink ++;
		System.out.println("基友借我一个空瓶子诶！");
		this.Print();
	}

	//还一个瓶盖
	public void BackCap()
	{
		this.CapNumOfDrink -- ;
		System.out.println("我归还了基友一个瓶盖！");
		this.Print();
	}

	//还一个空瓶子
	public void BackBot()
	{
		this.BotNumOfDrink --;
		System.out.println("我还了基友一个空瓶子诶！");
		this.Print();
	}

	//用空瓶子换饮料
	public void BotToDrink()
	{
		System.out.println("我用2个空瓶子换了一瓶饮料，然后把它喝掉了~");
		this.Drinks ++ ;
		this.CapNumOfDrink ++;
		this.BotNumOfDrink --;
		this.Print();
	}

	//用瓶盖换饮料
	public void CapToDrink()
	{
		System.out.println("我用5个瓶盖换了一瓶饮料，然后把它喝掉了~");
		this.Drinks ++;
		this.BotNumOfDrink ++;
		this.CapNumOfDrink -= 4;
		this.Print();
	}

}

public class Drinking_1_1
{
	public static void main(String[] args)
	{
		Drink D1 = new Drink();
		D1.Print();
		while(D1.getMoney() > 0 || D1.getCapNumOfDrink() > 3 || D1.getBotNumOfDrink() > 0)
		{
			while(D1.getMoney() >= 2)
			{
				D1.BuyOne();
			}
			while(D1.getCapNumOfDrink() >3)
			{
				if(D1.getCapNumOfDrink() == 4)
				{
					D1.BorrowCap();
					D1.CapToDrink();
					D1.BackCap();
				}
				else
				{
					D1.CapToDrink();
				}
			}
			while(D1.getBotNumOfDrink() > 0)
			{
				if(D1.getBotNumOfDrink() == 1)
				{
					D1.BorrowBot();
					D1.BotToDrink();
					D1.BackBot();
				}
				else
				{
					D1.BotToDrink();
				}
			}
		}
	}
}
